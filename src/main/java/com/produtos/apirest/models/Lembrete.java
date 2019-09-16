package com.produtos.apirest.models;

import com.produtos.apirest.util.Prioridade;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name="lembrete")
public class Lembrete {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @NotNull
    private String conteudo;
    @Enumerated(EnumType.STRING)
    @Column
    private Prioridade prioridade;
    @Column
    private Long modificado;
    @Column
    private Boolean arquivado;
    @Column
    private BigDecimal numeroUsuarios;
    @Column
    private String cor;





    public Lembrete() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public Boolean getArquivado() {
        return arquivado;
    }

    public void setArquivado(Boolean arquivado) {
        this.arquivado = arquivado;
    }

    public Long getModificado() {
        return modificado;
    }

    public void setModificado(Long modificado) {
        this.modificado = modificado;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lembrete lembrete = (Lembrete) o;
        return id == lembrete.id &&
                Objects.equals(conteudo, lembrete.conteudo) &&
                prioridade == lembrete.prioridade &&
                Objects.equals(arquivado, lembrete.arquivado) &&
                Objects.equals(modificado, lembrete.modificado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, conteudo, prioridade, arquivado, modificado);
    }

    @Override
    public String toString() {
        return "Lembrete{" +
                "id=" + id +
                ", conteudo='" + conteudo + '\'' +
                ", prioridade=" + prioridade +
                ", arquivado=" + arquivado +
                ", modificado=" + modificado +
                '}';
    }

    public BigDecimal getNumeroUsuarios() {
        return numeroUsuarios;
    }

    public void setNumeroUsuarios(BigDecimal numeroUsuarios) {
        this.numeroUsuarios = numeroUsuarios;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
