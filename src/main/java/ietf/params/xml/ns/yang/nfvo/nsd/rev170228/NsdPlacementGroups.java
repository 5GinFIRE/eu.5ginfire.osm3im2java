package ietf.params.xml.ns.yang.nfvo.nsd.rev170228;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.placement.groups.PlacementGroups;

import java.util.List;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * grouping nsd-placement-groups {
 *     list placement-groups {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf requirement {
 *             type string;
 *         }
 *         leaf strategy {
 *             type strategy;
 *         }
 *         list member-vnfd {
 *             key "member-vnf-index-ref";
 *             leaf member-vnf-index-ref {
 *                 type string;
 *             }
 *             leaf vnfd-id-ref {
 *                 type leafref;
 *             }
 *         }
 *         uses placement-group-info;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd/nsd-placement-groups</i>
 *
 */
public interface NsdPlacementGroups
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
        "2017-02-28", "nsd-placement-groups").intern();

    /**
     * List of placement groups at NS level
     *
     *
     *
     * @return <code>java.util.List</code> <code>placementGroups</code>, or <code>null</code> if not present
     */
    List<PlacementGroups> getPlacementGroups();

}

