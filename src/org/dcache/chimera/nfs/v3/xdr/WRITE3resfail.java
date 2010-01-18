/*
 * Automatically generated by jrpcgen 1.0.7 on 2/21/09 1:22 AM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 */
package org.dcache.chimera.nfs.v3.xdr;
import org.dcache.xdr.*;
import java.io.IOException;

public class WRITE3resfail implements XdrAble {
    public wcc_data file_wcc;

    public WRITE3resfail() {
    }

    public WRITE3resfail(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        file_wcc.xdrEncode(xdr);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        file_wcc = new wcc_data(xdr);
    }

}
// End of WRITE3resfail.java