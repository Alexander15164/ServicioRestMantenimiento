package sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.Parte;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-04T18:50:23")
@StaticMetamodel(TipoParte.class)
public class TipoParte_ { 

    public static volatile SingularAttribute<TipoParte, String> descripcion;
    public static volatile CollectionAttribute<TipoParte, Parte> parteCollection;
    public static volatile SingularAttribute<TipoParte, Integer> idTipoParte;
    public static volatile SingularAttribute<TipoParte, String> nombre;

}