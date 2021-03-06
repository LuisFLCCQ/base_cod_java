package mercado.controller;

import java.util.List;
import mercado.Interface.IFachada;
import mercado.model.DescontoProduto;
import mercado.model.Produto;
import mercado.model.UsuarioAdministrador;
import mercado.model.UsuarioCliente;

public class Fachada implements IFachada{
    ControladorCliente controladorCliente;
    ControladorProduto controladorProduto;
    ControladorAdministrador controladorAdministrador; 
    
    public Fachada(){
        this.controladorCliente = new ControladorCliente();
        this.controladorProduto = new ControladorProduto();
        this.controladorAdministrador = new ControladorAdministrador();
    }

    @Override
    public boolean cadastrarCliente(UsuarioCliente cliente) {
        return this.controladorCliente.cadastrar(cliente);        
    }

    @Override
    public boolean removerCliente(String CPF) {
        return this.controladorCliente.remover(CPF);
    }

    @Override
    public boolean cadastarAdministrador(UsuarioAdministrador administrador) {
        return this.controladorAdministrador.cadastro(administrador);
    }

    @Override
    public boolean cadastrarProdutos(Produto produto) {
        return this.controladorProduto.cadastrarProduto(produto);
    }

    @Override
    public boolean alterarQuantidade(int codigo, int quantidade) {
        return this.controladorProduto.alterarQuantidade(codigo, quantidade);
    }

    @Override
    public List visualizarProdutos() {
        return this.controladorProduto.listarProdutos();
    }

    @Override
    public boolean removerProduto(int codigo) {
        return this.controladorProduto.removerProduto(codigo);
    }

    @Override
    public boolean loginCliente(String CPF, String senha) {
        return this.controladorCliente.login(CPF, senha);
    }

    @Override
    public boolean adicionarProdutoCarrinho(int codigo) {
        Produto produto = this.controladorProduto.retornarProduto(codigo);
        if(produto != null){
            return this.controladorCliente.adicionarItemCarrinho(produto);
        }else{
            return false;
        }
    }

    @Override
    public boolean removerItemCarrinho(int codigo) {
        Produto produto = this.controladorProduto.retornarProduto(codigo);
        if(produto != null){
            return this.controladorCliente.removerItemCarrinho(produto);
        }else{
            return false;
        }
    }

    @Override
    public boolean loginAdministrador(String CPF, String senha) {
        return this.controladorAdministrador.login(CPF, senha);
    }

    @Override
    public boolean cadastrarProduto(Produto produto) {
        return this.controladorProduto.cadastrarProduto(produto);
    }

    @Override
    public List visualizarCarrinho() {
        return this.controladorCliente.visualizarCarrinho();
    }

    @Override
    public boolean finalizarCompra() {
        return this.controladorCliente.finaliarCompra();
    }

    @Override
    public boolean aplicarDescontoAleatorio() {
        return this.controladorProduto.aplicarDescontoAleatorio();
    }
    
}
