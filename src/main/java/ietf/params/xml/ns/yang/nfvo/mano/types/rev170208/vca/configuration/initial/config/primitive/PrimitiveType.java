package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive;
import org.opendaylight.yangtools.yang.binding.DataContainer;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitiveBuilder.InitialConfigPrimitiveImpl;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type.PrimitiveDefinitionBuilder.PrimitiveDefinitionImpl;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.VnfdBuilder.VnfdImpl;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * choice primitive-type {
 *     case primitive-definition {
 *         leaf name {
 *             type string;
 *         }
 *         list parameter {
 *             key "name";
 *             leaf name {
 *                 type string;
 *             }
 *             leaf value {
 *                 type string;
 *             }
 *         }
 *         leaf user-defined-script {
 *             type string;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-configuration/initial-config-primitive/primitive-type</i>
 *
 */
@JsonDeserialize(as = PrimitiveDefinitionImpl.class)
public interface PrimitiveType
    extends
    DataContainer
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "primitive-type").intern();


}

