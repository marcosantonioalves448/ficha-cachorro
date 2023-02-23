public class app {
    public static void main(String[] args) throws Exception {
    
        Cachorro Clifford = new Cachorro("Clifford", "Vira-lata", 23, 2021, 6f, true, 'M');
        Clifford.description();
        Clifford.Imcc();
    }
}

class Cachorro {

    private String race;
    private float size;
    private int age;
    private String name;
    private char sex;
    private float weight;
    private boolean hasVaccine;
    
    public Cachorro(String name, String race, float size, int birth, float weight, boolean hasVaccine, char sex){
        this.name = name;
        this.race = race;
        this.size = size;
        this.age = 2023 - birth;
        this.weight = weight;
        this.hasVaccine = hasVaccine;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "clifford";
    }

    public String gethasVaccine() {
        if (hasVaccine) {
            return "Sim";
        } else {
            return "Não";
        }
    }

    public void sethasVaccine(boolean hasVaccine) {
        this.hasVaccine = true;
    }
    
    public void description(){ 
        System.out.println("Esse é o " + name + sex + " é da raça " + race + " tamanho " + size + " idade " + age + " peso " + weight + " vacinado? " + gethasVaccine() + ".");
    }

    public void Imcc(){
        float imcc = weight / (size * size);
        if(imcc <= 18.5){
            System.out.println("Abaixo do peso");
        }else if (imcc > 18.5 && imcc <= 25){
            System.out.println("Peso normal");
        }else if (imcc > 25 && imcc <= 30){
            System.out.println("Acima do peso");
        }else {
            System.out.println("Obeso");
        }
    }
}
