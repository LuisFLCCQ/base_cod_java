/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ada2java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author joaot
 */
public class VariableHandler implements AdaHandler{
    
    Map<String, String> varString = new HashMap<String, String>();
    Map<String, Integer> varInt = new HashMap<String, Integer>();
    Map<String, Float> varFloat = new HashMap<String, Float>();
    Map<String, Boolean> varBoolean = new HashMap<String, Boolean>();
    Map<String, Character> varChar = new HashMap<String, Character>();

    @Override
    public void addLine(String s) {
        s = s.replaceAll(" ", "");
        String[] split = s.split(":");
        
        if (split.length == 3){
            split[2] = split[2].replaceAll("\\W", "");
        }
        
        if(split.length == 2 && split[1].startsWith("String")){
            if(split.length == 3){
                varString.put(split[0], split[2]);
            }
            else
                varString.put(split[0], "");
        } else if(split.length == 2 && split[1].startsWith("Integer")){
            if(split.length == 3){
                varInt.put(split[0], Integer.parseInt(split[2]));
            }
            else
                varInt.put(split[0], 0);
        } else if(split.length == 2 && split[1].startsWith("float")){
            if(split.length == 3){
                varFloat.put(split[0], Float.parseFloat(split[2]));
            }
            else
                varFloat.put(split[0], 0.0f);
        } else if(split.length == 2 && split[1].startsWith("Boolean")){
            if(split.length == 3){
                varBoolean.put(split[0], Boolean.parseBoolean(split[2]));
            }
            else
                varBoolean.put(split[0], false);
        } else if(split.length == 2 && split[1].startsWith("Character")){
            if(split.length == 3){
                varChar.put(split[0], split[2].charAt(0));
                mostrarChar();
            } else {
                varChar.put(split[0], Character.MIN_VALUE);
            }
            
            /*if(split[2] != null){
                varChar.put(split[0], split[2].toCharArray());
            }
            else{
                varChar.put(split[0], );
            }*/
        }
        
    }

    private void mostrarChar() {
        Iterator<Character> itr = varChar.values().iterator();
        while (itr.hasNext()) {
		System.out.println(itr.next());
	}
    }
    
}
