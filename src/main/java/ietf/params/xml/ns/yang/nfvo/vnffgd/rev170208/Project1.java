package ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import http.riftio.rw.project.rev150910.Project;
import ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog;

public interface Project1
    extends
    DataObject,
    Augmentation<Project>
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog</code> <code>vnffgdCatalog</code>, or <code>null</code> if not present
     */
    VnffgdCatalog getVnffgdCatalog();

}

