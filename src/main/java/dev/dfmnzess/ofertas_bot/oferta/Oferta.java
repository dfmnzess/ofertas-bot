package dev.dfmnzess.ofertas_bot.oferta;

import java.math.BigDecimal;
import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Oferta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String loja;
    private BigDecimal preco;
    private String linkAfiliado;
    private boolean publicada = false;
    private Instant criadaEm = Instant.now();

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getLoja() { return loja; }
    public void setLoja(String loja) { this.loja = loja; }

    public BigDecimal getPreco() { return preco; }
    public void setPreco(BigDecimal preco) { this.preco = preco; }

    public String getLinkAfiliado() { return linkAfiliado; }
    public void setLinkAfiliado(String linkAfiliado) { this.linkAfiliado = linkAfiliado; }

    public boolean isPublicada() { return publicada; }
    public void setPublicada(boolean publicada) { this.publicada = publicada; }

    public Instant getCriadaEm() { return criadaEm; }
    public void setCriadaEm(Instant criadaEm) { this.criadaEm = criadaEm; }
}