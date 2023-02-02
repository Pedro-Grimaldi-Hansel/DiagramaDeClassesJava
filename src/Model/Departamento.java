package Model;

import java.util.ArrayList;

public class Departamento{

    //Atributos

    private int codigo;
    private ArrayList<Funcionario> funcionarios;

    //Metodos

    public int getCodigo() {
        return codigo;
    }
    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
