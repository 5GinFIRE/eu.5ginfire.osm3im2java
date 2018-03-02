package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.Alarm;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.InsufficientData;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Ok;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container actions {
 *     list ok {
 *         key "url";
 *         leaf url {
 *             type string;
 *         }
 *     }
 *     list insufficient-data {
 *         key "url";
 *         leaf url {
 *             type string;
 *         }
 *     }
 *     list alarm {
 *         key "url";
 *         leaf url {
 *             type string;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/alarm/actions</i>
 * 
 * <p>To create instances of this class use {@link ActionsBuilder}.
 * @see ActionsBuilder
 *
 */
public interface Actions
    extends
    ChildOf<Alarm>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.Actions>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "actions").intern();

    /**
     * @return <code>java.util.List</code> <code>ok</code>, or <code>null</code> if not present
     */
    List<Ok> getOk();
    
    /**
     * @return <code>java.util.List</code> <code>insufficientData</code>, or <code>null</code> if not present
     */
    List<InsufficientData> getInsufficientData();
    
    /**
     * @return <code>java.util.List</code> <code>alarm</code>, or <code>null</code> if not present
     */
    List<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Alarm> getAlarm();

}

