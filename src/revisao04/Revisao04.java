/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao04;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Fagundes
 */
public class Revisao04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Elabore um algoritmo que calcule o que deve ser pago por um produto, 
        considerando o preço normal de etiqueta e a escolha da condição de 
        pagamento. Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado.
        Código Condição de pagamento - 
        Código: 1 -> À vista em dinheiro ou cheque, recebe 10% de desconto;-
        Código: 2 -> À vista no cartão de crédito, recebe 15% de desconto; - 
        Código: 3 -> Em duas vezes, preço normal de etiqueta sem juros; - 
        Código: 4 -> Em duas vezes, preço normal de etiqueta mais juros de 10% */
        
        DecimalFormat f = new DecimalFormat("0.00");
        int formaPagamento;
        double preco;
        
        preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da mercadoria:"));
        formaPagamento = Integer.parseInt(JOptionPane.showInputDialog("Escolha a forma de pagamento:"
                +"\n1 - À vista em dinheiro ou cheque, recebe 10% de desconto"
                +"\n2 - A vista no cartão de crédito, recebe 15% de desconto"
                +"\n3 - Em 2 vezes, preço normal de etiqueta sem juros"
                +"\n4 - Em 3 vezes, preço normal de etiqueta mais juros de 10%"));
        
        switch(formaPagamento){
            case 1:
                JOptionPane.showMessageDialog(null, "Desconto de 10%" 
                        +"\nTotal a pagar: R$" +f.format(preco*0.9));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Desconto de 15%"
                        +"\nTotal a pagar: R$" +f.format(preco*0.85));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Preço de etiqueta (2x sem juros):"
                        +"\nTotal a pagar: 2x sem juros de R$" +f.format(preco));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Preço de etiqueta (3x mais juros de 10%):"
                        +"\nTotal a pagar: 3x mais juros de 10% de R$" +f.format(preco*1.1));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Forma de pagamento inválida, tente novamente.");
        }
    }
    
}
