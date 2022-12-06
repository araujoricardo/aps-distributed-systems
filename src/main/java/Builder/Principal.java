/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;


public class Principal {
     public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa.PessoaBuilder("Mateus").ultimonome("Silva").
                nomeDoMeio("Santos").
                nomeDaMae("Maria").nomeDoPai("Rodrigo").criarPessao();
                
                System.out.println(p1.toString());
    }
    
    
}
