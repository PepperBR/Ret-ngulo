public class Retangulo {
    private float lenght;
    private float width;
    private float area;
    private float perimetro;

    // Métodos Set:

    public void setLenght (float lenght){
        if(0f < lenght && lenght < 20f ){
            this.lenght = lenght;
        } 
    }
    public void setWidth (float width){
        if(0f < width && width < 20f){
            this.width = width;
        } 
    }

    // Métodos Get:

    public float getLenght (){
        return this.lenght;
    }
    public float getWidth (){
        return this.width;
    }

    // Construtor :

    public Retangulo (){
        this.lenght = 1f;
        this.width = 1f;
    }

    // Método para Calcular a Área :

    public float calcularArea (){
        area = lenght * width;
        return area;
    }

    // Método para Calcular o Perímetro :

    public float calcularPerimetro (){
        perimetro = 2 * (lenght + width);
        return perimetro; 
    }

    public static void main(String [] args){
        Retangulo r = new Retangulo();
        r.setLenght(13f);
        r.setWidth(21f);

        System.out.println("O lenght do Retângulo é : " + r.getLenght() + "\nO width dp Retângulo é : " + r.getWidth());

        System.out.println("A área do retângulo é " + r.calcularArea());
        System.out.println("O perímetro do retângulo é " + r.calcularPerimetro());
    }

}