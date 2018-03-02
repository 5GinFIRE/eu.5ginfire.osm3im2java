package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ui.primitive.group.ParameterGroup;

import java.util.List;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping ui-primitive-group {
 *     list parameter-group {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         list parameter {
 *             key "name";
 *             leaf name {
 *                 type string;
 *             }
 *             leaf data-type {
 *                 type parameter-data-type;
 *             }
 *             leaf mandatory {
 *                 type mandatory;
 *             }
 *             leaf default-value {
 *                 type string;
 *             }
 *             leaf parameter-pool {
 *                 type string;
 *             }
 *             leaf read-only {
 *                 type read-only;
 *             }
 *             leaf hidden {
 *                 type hidden;
 *             }
 *             uses primitive-parameter;
 *         }
 *         leaf mandatory {
 *             type mandatory;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/ui-primitive-group</i>
 *
 */
public interface UiPrimitiveGroup
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "ui-primitive-group").intern();

    /**
     * Grouping of parameters which are logically grouped in UI
     *
     *
     *
     * @return <code>java.util.List</code> <code>parameterGroup</code>, or <code>null</code> if not present
     */
    List<ParameterGroup> getParameterGroup();

}

