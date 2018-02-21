package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.CloudProvider;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * case mock {
 *     leaf mock-construct {
 *         type empty;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/placement-group-input/cloud-provider/mock</i>
 *
 */
public interface Mock
    extends
    DataObject,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Mock>,
    CloudProvider
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "mock").intern();

    /**
     * @return <code>java.lang.Boolean</code> <code>mockConstruct</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isMockConstruct();

}

