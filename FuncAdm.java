public class FuncAdm extends Funcionario {
    
    private String setor;
    private String cargo;

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getSetor() {
        return this.setor;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return this.cargo;
    }

    public FuncAdm (String nome, int idade, String endereco, double salario, String cargo, String setor) {
        super(nome, idade, endereco, salario);
        this.setor = setor;
        this.cargo = cargo;
    }

    public FuncAdm () {

    }
}