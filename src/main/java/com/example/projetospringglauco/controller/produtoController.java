package com.example.projetospringglauco.controller;

import java.util.ArrayList;

import com.example.projetospringglauco.ProdutoServices.ProdutoService;
import com.example.projetospringglauco.model.produtoModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * produtoController
 */
@Controller
@RequestMapping("/produto")
public class produtoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/{idProduto}")
    public ModelAndView getProduto(
        @PathVariable("idProduto") int codigo
    )
    {
        ModelAndView modelAndView = new ModelAndView("produtoPorIdView");
    
        produtoModel produto = produtoService.getProdutoID(codigo);

        modelAndView.addObject("produto", produto);

        return modelAndView;
    }

    @GetMapping("/produtosEmEstoque")
    public ModelAndView getProdutoEmEstoque()
    {
        ModelAndView modelAndView = new ModelAndView("produtoEmEstoque");

        ArrayList<produtoModel> produtos = produtoService.getProdutosEmEstoque();

        modelAndView.addObject("ProdutoEstoque", produtos);

        return modelAndView;
    }

    @GetMapping("/produtosValorAcima/{valor}")
    public ModelAndView getProdutosAcima(
        @PathVariable("valor") double valor
    )
    {
        ModelAndView modelAndView = new ModelAndView("produtosAcima");

        ArrayList<produtoModel> produtosAcima = produtoService.getProdutosAcima(valor);

        modelAndView.addObject("ProdutoEstoque", produtosAcima);

        return modelAndView;
    }


    @GetMapping("/produtosValorAbaixo/{valor}")
    public ModelAndView getProdutosAbaixo(
        @PathVariable("valor") double valor
    )
    {
        ModelAndView modelAndView = new ModelAndView("produtosAbaixo");

        ArrayList<produtoModel> produtosAbaixo = produtoService.getProdutosAbaixo(valor);

        modelAndView.addObject("ProdutoEstoque", produtosAbaixo);

        return modelAndView;
    }


}