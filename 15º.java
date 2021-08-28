import javax.swing.JOptionPane;
 
public class main {
	
public static void main(String[]args) {
	
String N1, N2, N3;
double NOTA1, NOTA2, NOTA3, MEDIA;
 
  N1 = JOptionPane.showInputDialog("Digite a primeira nota: ");
  NOTA1 = Double.parseDouble(N1);
  
  N2 = JOptionPane.showInputDialog("Digite a segunda nota: ");
  NOTA2 = Double.parseDouble(N1);
 
  N3 = JOptionPane.showInputDialog("Digite a Terceira nota: ");
  NOTA3 = Double.parseDouble(N3);
  
  MEDIA = (NOTA1 + NOTA2 + NOTA3) / 3;
  if (MEDIA >= 6.0)
  {
    JOptionPane.showMessageDialog(null,"A média do aluno é: "+ MEDIA,"Aprovado",JOptionPane.INFORMATION_MESSAGE);
  } if
 (MEDIA < 6.0 & MEDIA > 4.0){
   JOptionPane.showMessageDialog(null,"A media do aluno é: "+ MEDIA, "Verificação suplementar", JOptionPane.WARNING_MESSAGE);
 }
  if (MEDIA<4.0)
  {
  JOptionPane.showMessageDialog(null,"A media do aluno é: "+ MEDIA, "Reprovado ", JOptionPane.WARNING_MESSAGE); 
  }
 
}
  
}
