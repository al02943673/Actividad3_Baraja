package collection;

public class Card {

	private String palo,valor,color;
	
	String[] Palo = {"Picas","Corazones","Diamantes","Tréboles"};
	String[] Valor = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	String[] Color = {"Negro, Rojo"};

	 //Constructor
    public Card(String palo, String valor, String color) {
        this.valor = valor;
        this.palo = palo;
        this.color = color;
    }

    @Override
    public String toString() {
        return "valor=" + valor + ", palo=" + palo + ", color" + color;
    }

}
	
	
