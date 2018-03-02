package http.riftio.project.vnfd.rev170228;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import http.riftio.project.vnfd.rev170228.project.VnfdCatalog;
import http.riftio.rw.project.rev150910.Project;

public interface Project1
    extends
    DataObject,
    Augmentation<Project>
{




    /**
     * Virtual Network Function Descriptor (VNFD).
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.project.vnfd.rev170228.project.VnfdCatalog</code> <code>vnfdCatalog</code>, or <code>null</code> if not present
     */
    VnfdCatalog getVnfdCatalog();

}

