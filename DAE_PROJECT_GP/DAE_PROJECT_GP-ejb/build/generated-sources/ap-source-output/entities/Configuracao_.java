package entities;

import entities.Cliente;
import entities.Estado;
import entities.Modulo;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-10T16:21:52")
@StaticMetamodel(Configuracao.class)
public class Configuracao_ { 

    public static volatile SingularAttribute<Configuracao, String> nomeSoftware;
    public static volatile SingularAttribute<Configuracao, Integer> versaoBase;
    public static volatile SingularAttribute<Configuracao, Cliente> cliente;
    public static volatile SingularAttribute<Configuracao, Integer> codigo;
    public static volatile SingularAttribute<Configuracao, Estado> estado;
    public static volatile SingularAttribute<Configuracao, Modulo> modulos;
    public static volatile SingularAttribute<Configuracao, String> descricao;

}