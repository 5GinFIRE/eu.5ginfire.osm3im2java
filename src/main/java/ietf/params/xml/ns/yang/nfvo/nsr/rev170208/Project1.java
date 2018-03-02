package ietf.params.xml.ns.yang.nfvo.nsr.rev170208;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import http.riftio.rw.project.rev150910.Project;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.KeyPair;

import java.util.List;

public interface Project1
    extends
    DataObject,
    Augmentation<Project>
{




    /**
     * Used to configure the list of public keys to be injected as partof ns 
     * instantiation
     *
     *
     *
     * @return <code>java.util.List</code> <code>keyPair</code>, or <code>null</code> if not present
     */
    List<KeyPair> getKeyPair();

}

