package ietf.params.xml.ns.yang.ietf.network.topology.rev150608;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.network.rev150608.network.Node;
import ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.TerminationPoint;

import java.util.List;

public interface Node1
    extends
    DataObject,
    Augmentation<Node>
{




    /**
     * A termination point can terminate a link.Depending on the type of topology, a 
     * termination pointcould, for example, refer to a port or an interface.
     *
     *
     *
     * @return <code>java.util.List</code> <code>terminationPoint</code>, or <code>null</code> if not present
     */
    List<TerminationPoint> getTerminationPoint();

}

