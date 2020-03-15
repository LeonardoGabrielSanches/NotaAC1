package com.example.projetospringglauco.ProdutoServices;

import java.util.ArrayList;

import com.example.projetospringglauco.ProdutoRepository.ProdutoRepository;
import com.example.projetospringglauco.model.produtoModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ProdutoService
 */
@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    private ArrayList<produtoModel> produtosRetorno = new ArrayList<>();

    public produtoModel getProdutoID(int id) {
        produtoModel produto = produtoRepository.getProdutoById(id);

        if (produto != null)
            return produto;

        return null;
    }

    public ArrayList<produtoModel> getProdutosEmEstoque() {

        produtosRetorno.clear();
        ArrayList<produtoModel> produtos = produtoRepository.getProdutos();

        for (produtoModel pr : produtos) {
            if (pr.getEstoque() > 0)
                produtosRetorno.add(pr);
        }

        return produtosRetorno;
    }

    public ArrayList<produtoModel> getProdutosAcima(Double valor) {

        produtosRetorno.clear();
        ArrayList<produtoModel> produtos = produtoRepository.getProdutos();

        for (produtoModel p : produtos) {
            if (p.getValor() > valor) {
                produtosRetorno.add(p);
            }
        }

        return produtosRetorno;
    }

    public ArrayList<produtoModel> getProdutosAbaixo(Double valor) {

        produtosRetorno.clear();
        ArrayList<produtoModel> produtos = produtoRepository.getProdutos();

        for (produtoModel p : produtos) {
            if (p.getValor() < valor) {
                produtosRetorno.add(p);
            }
        }

        return produtosRetorno;
    }

}