package Java;
/**/
public class Main {
	public static void main(String[] args) {
		Pessoa x = new Pessoa("Alisson", 19);
        System.out.println(x.getNome());
        Pessoa y = new Pessoa(19);
        System.out.println(y.getIdade());
        Pessoa z = new Pessoa("2004-05-16");
        System.out.println(z.getDataNasc());

	}
}
