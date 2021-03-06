package ouenerguate.dictamen;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class ObjectTipoConductor implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "OBJECTTIPOCONDUCTOR_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(sequenceName = "OBJECTTIPOCONDUCTOR_ID_SEQ", name = "OBJECTTIPOCONDUCTOR_ID_GENERATOR")
   private java.lang.Long id;

   @org.kie.api.definition.type.Label(value = "caso")
   private java.lang.String caso;
   @org.kie.api.definition.type.Label(value = "fases")
   private java.lang.String fases;
   @org.kie.api.definition.type.Label(value = "neutro")
   private java.lang.String neutro;
   @org.kie.api.definition.type.Label(value = "bt")
   private java.lang.String bt;
   @org.kie.api.definition.type.Label(value = "numClienteConectar")
   private java.lang.String numClienteConectar;
   @org.kie.api.definition.type.Label(value = "nombreInteresado")
   private java.lang.String nombreInteresado;
   @org.kie.api.definition.type.Label(value = "tipoServicio")
   private java.lang.String tipoServicio;
   @org.kie.api.definition.type.Label(value = "coordenadasX")
   private java.lang.String coordenadasX;
   @org.kie.api.definition.type.Label(value = "coordenadasY")
   private java.lang.String coordenadasY;

   public ObjectTipoConductor()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.String getCaso()
   {
      return this.caso;
   }

   public void setCaso(java.lang.String caso)
   {
      this.caso = caso;
   }
   
   public java.lang.String getFases()
   {
      return this.fases;
   }

   public void setFases(java.lang.String fases)
   {
      this.fases = fases;
   }

   public java.lang.String getNeutro()
   {
      return this.neutro;
   }

   public void setNeutro(java.lang.String neutro)
   {
      this.neutro = neutro;
   }

   public java.lang.String getBt()
   {
      return this.bt;
   }

   public void setBt(java.lang.String bt)
   {
      this.bt = bt;
   }

   public java.lang.String getNumClienteConectar()
   {
      return this.numClienteConectar;
   }

   public void setNumClienteConectar(java.lang.String numClienteConectar)
   {
      this.numClienteConectar = numClienteConectar;
   }

   public java.lang.String getNombreInteresado()
   {
      return this.nombreInteresado;
   }

   public void setNombreInteresado(java.lang.String nombreInteresado)
   {
      this.nombreInteresado = nombreInteresado;
   }

   public java.lang.String getTipoServicio()
   {
      return this.tipoServicio;
   }

   public void setTipoServicio(java.lang.String tipoServicio)
   {
      this.tipoServicio = tipoServicio;
   }

   public java.lang.String getCoordenadasX()
   {
      return this.coordenadasX;
   }

   public void setCoordenadasX(java.lang.String coordenadasX)
   {
      this.coordenadasX = coordenadasX;
   }

   public java.lang.String getCoordenadasY()
   {
      return this.coordenadasY;
   }

   public void setCoordenadasY(java.lang.String coordenadasY)
   {
      this.coordenadasY = coordenadasY;
   }

   public ObjectTipoConductor(java.lang.String fases, java.lang.String neutro,
         java.lang.String bt, java.lang.String numClienteConectar,
         java.lang.String nombreInteresado, java.lang.String tipoServicio,
         java.lang.String coordenadasX, java.lang.String coordenadasY)
   {
      this.fases = fases;
      this.neutro = neutro;
      this.bt = bt;
      this.numClienteConectar = numClienteConectar;
      this.nombreInteresado = nombreInteresado;
      this.tipoServicio = tipoServicio;
      this.coordenadasX = coordenadasX;
      this.coordenadasY = coordenadasY;
   }

   public ObjectTipoConductor(java.lang.Long id, java.lang.String caso)
   {
      this.id = id;
      this.caso = caso;
   }

}