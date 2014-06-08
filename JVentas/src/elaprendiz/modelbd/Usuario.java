package elaprendiz.modelbd;

import elaprendiz.EncriptadorPassword;
import elaprendiz.core.DatoArchivo;
import elaprendiz.core.JAbstractModelBD;
import java.io.FileInputStream;
import java.io.Serializable;

/**
 *
 * @author El APRENDIZ www.elaprendiz.net63.net**
 */
public class Usuario extends JAbstractModelBD implements Serializable,IModel{
    private static final long serialVersionUID = 1L;
    public static final String nt = "gv_usuario";
    public static final String COLUMNA_PK = "idu";
    public static final String COLUMNA_ACTIVO = "activo";
    public static final String[] tCargos ={"Seleccionar Cargo","CAJA","COMPRAS","VENTAS","SERVICIO TENICO",
                                            "ALMACEN","MULTIPLE"};
    public static final String[] sexos={"Seleccionar Sexo","Hombre","Mujer"};
    
    private Integer idu; 
    private String dni;
    private String codigo; 
    private String login; 
    private String nombre; 
    private String apellidos;
    private FileInputStream foto;
    private String clave;
    private String salt; 
    private long fechaNacimiento;
    private String fono;
    private String fono2;
    private String celular;
    private String nextel;
    private String email;
    private String sexo;
    private String tipoCargo; 
    private String descipcion;
    private Integer activo = 1;
    private long fecRegistro; 
    private long fecBaja;
    private DatoArchivo dat;
    
    private boolean activoBool;
    
    private String tipoCargoAlmacen;
    
    public static final String FULL_NOM_CAMPOS = "idu,dni,codigo,login,nombre,apellidos,"+ 
	"foto,clave,salt, fec_nac, fono, fono2, celular, nextel, email, sexo, tipo_cargo,"+ 
	"descripcion, activo, fec_registro, fec_baja";
    public static final String NO_FULL_NOM_CAMPOS = "dni,codigo,login,nombre,apellidos,"+ 
	"foto,clave,salt, fec_nac, fono, fono2, celular, nextel, email, sexo, tipo_cargo,"+ 
	"descripcion, activo, fec_registro, fec_baja";
    public static final String SIN_FOTO_CLAVE = "dni,codigo,login,nombre,apellidos,"+ 
	"fec_nac, fono, fono2, celular, nextel, email, sexo, tipo_cargo,"+ 
	"descripcion, activo, fec_registro, fec_baja";
    public static final String CON_FOTO = "dni,codigo,login,nombre,apellidos,"+ 
	"foto,fec_nac, fono, fono2, celular, nextel, email, sexo, tipo_cargo,"+ 
	"descripcion, activo, fec_registro, fec_baja";
    
    public static final String OBLIGATORIOS_NOM_CAMPOS = "dni,codigo,login,nombre,apellidos"
            + "clave,salt,fono,sexo,tipo_cargo,fec_registro";

    /**
     * constructor que inicializa los campos obligatorios;
     * @param dni
     * @param codigo
     * @param login
     * @param nombre
     * @param apellidos
     * @param clave
     * @param salt
     * @param fono
     * @param sexo
     * @param tipoCargo
     * @param fecRegistro 
     */
    public Usuario(String dni, String codigo, String login, String nombre, String apellidos, String clave, String salt, String fono, String sexo, String tipoCargo, long fecRegistro) {
        this.dni = dni;
        this.codigo = codigo;
        this.login = login;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.clave = clave;
        this.salt = salt;
        this.fono = fono;
        this.sexo = sexo;
        this.tipoCargo = tipoCargo;
        this.fecRegistro = fecRegistro;
        initBasic();
    }
    
    public Usuario(Integer idu,String dni, String codigo, String login, String nombre, String apellidos, String clave, String salt, String fono, String sexo, String tipoCargo, long fecRegistro) {
        this.idu = idu;
        this.dni = dni;
        this.codigo = codigo;
        this.login = login;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.clave = clave;
        this.salt = salt;
        this.fono = fono;
        this.sexo = sexo;
        this.tipoCargo = tipoCargo;
        this.fecRegistro = fecRegistro;
        initBasic();
    }

    public Usuario(Integer idu, String dni, String codigo, String login, String nombre, String apellidos, FileInputStream foto, String clave, String salt, Integer fechaNacimiento, String fono, String fono2, String celular, String nextel, String email, String sexo, String tipoCargo, String descipcion, Integer activo, long fecRegistro, long fecBaja, boolean activoBool) {
        this.idu = idu;
        this.dni = dni;
        this.codigo = codigo;
        this.login = login;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.foto = foto;
        this.clave = clave;
        this.salt = salt;
        this.fechaNacimiento = fechaNacimiento;
        this.fono = fono;
        this.fono2 = fono2;
        this.celular = celular;
        this.nextel = nextel;
        this.email = email;
        this.sexo = sexo;
        this.tipoCargo = tipoCargo;
        this.descipcion = descipcion;
        this.activo = activo;
        this.fecRegistro = fecRegistro;
        this.fecBaja = fecBaja;
        this.activoBool = activoBool;
        initBasic();
    }
    public Usuario(String dni, String codigo, String login, String nombre, String apellidos, FileInputStream foto, String clave, String salt, Integer fechaNacimiento, String fono, String fono2, String celular, String nextel, String email, String sexo, String tipoCargo, String descipcion, Integer activo, long fecRegistro, long fecBaja, boolean activoBool) {
        this.dni = dni;
        this.codigo = codigo;
        this.login = login;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.foto = foto;
        this.clave = clave;
        this.salt = salt;
        this.fechaNacimiento = fechaNacimiento;
        this.fono = fono;
        this.fono2 = fono2;
        this.celular = celular;
        this.nextel = nextel;
        this.email = email;
        this.sexo = sexo;
        this.tipoCargo = tipoCargo;
        this.descipcion = descipcion;
        this.activo = activo;
        this.fecRegistro = fecRegistro;
        this.fecBaja = fecBaja;
        this.activoBool = activoBool;
        initBasic();
    }

    

    public Usuario() {
        initBasic();
    }

    public long getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(long fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
    private void initBasic()
    {
        this.setNombreTabla(nt);
        this.setCampoClavePrimaria("idu");
        this.setCampoExistencial("activo");
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;        
    }

    public boolean isActivoBool() {
       return activoBool;
    }

    public void setActivoBool(boolean activoBool) {
        setActivo(activoBool?1:0);
        this.activoBool = activoBool;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getFecBaja() {
        return fecBaja;
    }

    public void setFecBaja(long fecBaja) {
        this.fecBaja = fecBaja;
    }

    public long getFecRegistro() {
        return fecRegistro;
    }

    public void setFecRegistro(long fecRegistro) {
        this.fecRegistro = fecRegistro;
    }

    public String getFono() {
        return fono;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

    public String getFono2() {
        return fono2;
    }

    public void setFono2(String fono2) {
        this.fono2 = fono2;
    }

    public FileInputStream getFoto() {
        return foto;
    }

    public void setFoto(FileInputStream foto) {
        this.foto = foto;
    }
    
    public void setFotoDA(FileInputStream foto,int longitud)
    {
        dat = new DatoArchivo(foto,longitud);
        this.foto = foto;
    }
    
     public void setFotoDA(DatoArchivo dat)
    {
        this.dat = dat;
        this.foto = dat.getFis();
    }
    
    public DatoArchivo getFoto(String s)
    {
        return dat;
    }

    public Integer getIdu() {
        return idu;
    }

    public void setIdu(Integer idu) {
        this.idu = idu;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNextel() {
        return nextel;
    }

    public void setNextel(String nextel) {
        this.nextel = nextel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getSexo(Object obj) {
        if(obj == null)
        {
           return sexo; 
        }else
        {
          if(sexo.equalsIgnoreCase("h"))
            {
                return "Hombre";
            }else
            {
                return "Mujer";
            }  
        }
        
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
        if(sexo.length()>1)
        {
           if(sexo.equalsIgnoreCase("hombre"))
            {
               this.sexo = "H"; 
            }else{
                this.sexo = "M";
            } 
        }
        
    }
    
    public void encriptarPass()
    {
        StringBuilder sb = new StringBuilder(this.dni+this.nombre.length()
                +this.codigo);
        this.salt = sb.reverse().append(this.codigo).toString();
        EncriptadorPassword ep = new EncriptadorPassword(this.salt);
        this.clave = ep.encrypt(this.clave);        
    }
    
    public String desencriptarPass()
    {
        EncriptadorPassword ep = new EncriptadorPassword(this.salt);           
        String desEncrypted  = ep.decrypt(this.clave);
        return  desEncrypted;
    }

    public String getTipoCargo() {
        return tipoCargo;
    }

    public void setTipoCargo(String tipoCargo) {
        this.tipoCargo = tipoCargo;
    }

    /**
     * metodo temporal
     * @return 
     */
    public String getTipoCargoAlmacen() {
        return tipoCargoAlmacen;
    }

    /**
     * Metodo temporal
     * @param tipoCargoAlmacen 
     */
    
    public void setTipoCargoAlmacen(String tipoCargoAlmacen) {
        this.tipoCargoAlmacen = tipoCargoAlmacen;
    }
    
    @Override
    public String toString() {
        return this.login;
    }
    
     @Override
    public int hashCode() {
        int hash = 0;
        hash += (idu != null ? idu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idu == null && other.idu != null) || (this.idu != null && !this.idu.equals(other.idu))) {
            return false;
        }
        return true;
    }
    
}
