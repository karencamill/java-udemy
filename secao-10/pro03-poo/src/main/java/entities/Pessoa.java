package entities;

public class Pessoa {

    private String name;
    private Integer age;
    private Double height;

    public Pessoa(String name, Integer age, Double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // Só usou get porque foi criada com todos os dados no construtor.
    // Não precisa ter seus dados alterados depois.
    // Os dados só precisam ser lidos, não modificados.

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getHeight() {
        return height;
    }

}
