package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.Actions;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list insufficient-data {
 *     key "url";
 *     leaf url {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/alarm/actions/insufficient-data</i>
 * 
 * <p>To create instances of this class use {@link InsufficientDataBuilder}.
 * @see InsufficientDataBuilder
 * @see InsufficientDataKey
 *
 */
public interface InsufficientData
    extends
    ChildOf<Actions>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.InsufficientData>,
    Identifiable<InsufficientDataKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "insufficient-data").intern();

    /**
     * @return <code>java.lang.String</code> <code>url</code>, or <code>null</code> if not present
     */
    java.lang.String getUrl();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.InsufficientDataKey</code> <code>key</code>, or <code>null</code> if not present
     */
    InsufficientDataKey getKey();

}

