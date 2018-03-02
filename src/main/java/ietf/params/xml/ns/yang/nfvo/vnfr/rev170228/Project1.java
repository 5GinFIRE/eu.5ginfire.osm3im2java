package ietf.params.xml.ns.yang.nfvo.vnfr.rev170228;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import http.riftio.rw.project.rev150910.Project;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog;

public interface Project1
    extends
    DataObject,
    Augmentation<Project>
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog</code> <code>vnfrCatalog</code>, or <code>null</code> if not present
     */
    VnfrCatalog getVnfrCatalog();

}

