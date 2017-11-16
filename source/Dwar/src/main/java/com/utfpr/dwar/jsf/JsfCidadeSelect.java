/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.dwar.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author admin
 */
@ManagedBean
@SessionScoped
public class JsfCidadeSelect  {

    /**
     * Creates a new instance of JsfCidadeSelect
     */
    public JsfCidadeSelect() {
    }
    
    private int idcidade;
    private String nome;
    
    public java.util.Collection<com.utfpr.dwar.data.entity.Cidade> getSelect(){
            return new com.utfpr.dwar.data.crud.CrudCidade().SelectByNome(this.nome);
    }

    public int getIdcidade() {
        return idcidade;
    }

    public void setIdcidade(int idcidade) {
        this.idcidade = idcidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
