package entities;

import entities.Configuracao;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-01T19:24:33")
@StaticMetamodel(Cliente.class)
public class Cliente_ extends User_ {

    public static volatile SingularAttribute<Cliente, String> pessoaContacto;
    public static volatile ListAttribute<Cliente, Configuracao> configuracoes;
    public static volatile SingularAttribute<Cliente, String> morada;

}