package ietf.params.xml.ns.yang.nfvo.nsr.rev170208;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import http.riftio.rw.project.rev150910.Project;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata;

public interface Project3
    extends
    DataObject,
    Augmentation<Project>
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata</code> <code>nsInstanceOpdata</code>, or <code>null</code> if not present
     */
    NsInstanceOpdata getNsInstanceOpdata();

}

