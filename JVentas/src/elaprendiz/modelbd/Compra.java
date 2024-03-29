package elaprendiz.modelbd;

import elaprendiz.core.JAbstractModelBD;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author elaprendiz <http://www.elaprendiz.net63.net>
 */
public class Compra extends JAbstractModelBD implements Serializable,IModel{
    private static final long serialVersionUID = 1L;
   
    public static final String nt = "gv_compra";
    public static final String COLUMNA_PK = "idcompra";
    public static final String COLUMNA_ACTIVO = "activo";
    
    public static final String[] TIPOSDOC = {"FACTURA","BOLETA","GUIA","NOTA DE PEDIDO","DUA"};
    public static final String[] ESTADOS = {"CANCELADO","PENDIENTE"};
    
    public static final String FULL_CAMPOS = "idcompra,tipodoc,numdoc,idproveedor,idusuario,"
                                            + "idmoneda,estado,numitems,observaciones,subtotal,"
                                            + "igv,total,fecha,activo";
    
    public static final String CAMPOS_NO_ID = "tipodoc,numdoc,idproveedor,idusuario,"
                                            + "idmoneda,estado,numitems,observaciones,subtotal,"
                                            + "igv,total,fecha,activo";
    
    public static final String CAMPOS_OBLIGATORIOS = "idcompra,tipodoc,numdoc,idproveedor,idusuario,"
                                                    + "idmoneda,estado,numitems,subtotal,"
                                                    + "total,fecha";
    
    private Integer id;
    private String tipoDocumento;
    private String numeroDocumento;
    private Proveedor idProveedor;
    private Usuario idUsuario;
    private Moneda idMoneda;
    private String estado;
    private Integer numeroItems;
    private String observaciones;
    private Double subtotla;
    private Integer igv;
    private Double total;
    private Date fecha;
    private Integer activo=1;
    private ArrayList<DetalleCompra> dc;
    
     public Compra() {
         initBasic();
    }

    public Compra(Integer id, String tipoDocumento, String numeroDocumento, Proveedor idProveedor, Usuario idUsuario, Moneda idMoneda, String estado, Integer numeroItems, String observaciones, Double subtotla, Integer igv, Double total, Date fecha, Integer activo) {
        this.id = id;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.idProveedor = idProveedor;
        this.idUsuario = idUsuario;
        this.idMoneda = idMoneda;
        this.estado = estado;
        this.numeroItems = numeroItems;
        this.observaciones = observaciones;
        this.subtotla = subtotla;
        this.igv = igv;
        this.total = total;
        this.fecha = fecha;
        this.activo = activo;
        initBasic();
    }

    public Compra(String tipoDocumento, String numeroDocumento, Proveedor idProveedor, Usuario idUsuario, Moneda idMoneda, String estado, Integer numeroItems, String observaciones, Double subtotla, Integer igv, Double total, Date fecha, Integer activo) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.idProveedor = idProveedor;
        this.idUsuario = idUsuario;
        this.idMoneda = idMoneda;
        this.estado = estado;
        this.numeroItems = numeroItems;
        this.observaciones = observaciones;
        this.subtotla = subtotla;
        this.igv = igv;
        this.total = total;
        this.fecha = fecha;
        this.activo = activo;
        initBasic();
    }

    public Compra(String tipoDocumento, String numeroDocumento, Proveedor idProveedor, Usuario idUsuario, Moneda idMoneda, String estado, Integer numeroItems, Double subtotla, Double total, Date fecha) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.idProveedor = idProveedor;
        this.idUsuario = idUsuario;
        this.idMoneda = idMoneda;
        this.estado = estado;
        this.numeroItems = numeroItems;
        this.subtotla = subtotla;
        this.total = total;
        this.fecha = fecha;
        initBasic();
    }
    private void initBasic()
    {
        this.setNombreTabla(nt);
        this.setCampoClavePrimaria(COLUMNA_PK);
        this.setCampoExistencial(COLUMNA_ACTIVO);
    }

    public ArrayList<DetalleCompra> getDetalleCompra() {
        return dc;
    }

    public void setDetalleCompra(ArrayList<DetalleCompra> dc) {
        this.dc = dc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Proveedor getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Proveedor idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Moneda getIdMoneda() {
        return idMoneda;
    }

    public void setIdMoneda(Moneda idMoneda) {
        this.idMoneda = idMoneda;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getNumeroItems() {
        return numeroItems;
    }

    public void setNumeroItems(Integer numeroItems) {
        this.numeroItems = numeroItems;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Double getSubtotla() {
        return subtotla;
    }

    public void setSubtotla(Double subtotla) {
        this.subtotla = subtotla;
    }

    public Integer getIgv() {
        return igv;
    }

    public void setIgv(Integer igv) {
        this.igv = igv;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Compra other = (Compra) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Compra{" + "tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento + '}';
    }
}
