package com.example.projetospringglauco.ProdutoRepository;

import java.util.ArrayList;
import java.util.HashMap;

import com.example.projetospringglauco.model.produtoModel;

import org.springframework.stereotype.Repository;

/**
 * ProdutoRepository
 */
@Repository
public class ProdutoRepository {

    public HashMap<Integer, produtoModel> produtos = new HashMap<>();

    public ProdutoRepository()
    {
        produtos.put(1, new produtoModel(1, "CALABRESA", 10.00, 50));
        produtos.put(2, new produtoModel(2, "BACON", 8.00, 20));
        produtos.put(3, new produtoModel(3, "FRANGO", 5.00, 30));
        produtos.put(4, new produtoModel(4, "QUEIJO", 25.00, 50));
        produtos.put(5, new produtoModel(5, "PRESUNTO", 12.00, 0));
        produtos.put(6, new produtoModel(6, "PAO", 4.00, 20));
        produtos.put(7, new produtoModel(7, "SALAME", 15.00, 75));
        produtos.put(8, new produtoModel(8, "GORGONZOLA", 20.00, 20));
        produtos.put(9, new produtoModel(9, "AMENDOIM", 10.00, 80));
        produtos.put(10, new produtoModel(10, "PEITO DE PERU", 20.00, 10));
    }

    public produtoModel getProdutoById(int id) {
        produtoModel produtoEncontrado = produtos.get(id);
        return produtoEncontrado;
    }

    public ArrayList<produtoModel> getProdutos()
    {
        ArrayList<produtoModel> produtosArray = new ArrayList<>();
        produtosArray.addAll(produtos.values());
        return produtosArray;
    }

}