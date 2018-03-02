package http.riftio.project.nsd.rev170228;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import http.riftio.project.nsd.rev170228.project.NsdCatalog;
import http.riftio.rw.project.rev150910.Project;

public interface Project1
    extends
    DataObject,
    Augmentation<Project>
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.project.nsd.rev170228.project.NsdCatalog</code> <code>nsdCatalog</code>, or <code>null</code> if not present
     */
    NsdCatalog getNsdCatalog();

}

