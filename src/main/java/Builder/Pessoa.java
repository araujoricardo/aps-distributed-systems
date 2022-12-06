/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;


public class Pessoa {
    
private String nome;
    private String nomeDoMeio;
    private String ultimoNome;
    private String nomeDoPai;
    private String nomeDaMae;

    private Pessoa(String nome, String nomeDoMeio, String ultimoNome, String nomeDoPai, String nomeDaMae) {
        this.nome = nome;
        this.nomeDoMeio = nomeDoMeio;
        this.ultimoNome = ultimoNome;
        this.nomeDoPai = nomeDoPai;
        this.nomeDaMae = nomeDaMae;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", nomeDoMeio=" + nomeDoMeio + ", ultimoNome=" + ultimoNome + ", nomeDoPai=" + nomeDoPai + ", nomeDaMae=" + nomeDaMae + '}';
    }

    public static class PessoaBuilder {
        private String nome;
        private String nomeDoMeio;
        private String ultimoNome;
        private String nomeDoPai;
        private String nomeDaMae;

        public PessoaBuilder(String nome) {
            this.nome = nome;
        }

        public PessoaBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public PessoaBuilder nomeDoMeio(String nomeDoMeio) {
            this.nomeDoMeio = nomeDoMeio;
            return this;
        }

        public PessoaBuilder ultimonome(String ultimoNome) {
            this.ultimoNome = ultimoNome;
            return this;
        }

        public PessoaBuilder nomeDoPai(String nomeDoPai) {
            this.nomeDoPai = nomeDoPai;
            return this;
        }

        public PessoaBuilder nomeDaMae(String nomeDaMae) {
            this.nomeDaMae = nomeDaMae;
            return this;
        }

        public Pessoa criarPessao() {
            return new Pessoa(nome, nomeDoMeio, ultimoNome, nomeDoPai, nomeDaMae);
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeDoMeio() {
        return nomeDoMeio;
    }

    public void setNomeDoMeio(String nomeDoMeio) {
        this.nomeDoMeio = nomeDoMeio;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getNomeDoPai() {
        return nomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

}

