package http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list alarm {
 *     key "alarm-id";
 *     leaf alarm-id {
 *         type string;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf description {
 *         type string;
 *     }
 *     leaf vdur-id {
 *         type string;
 *     }
 *     container actions {
 *         list ok {
 *             key "url";
 *             leaf url {
 *                 type string;
 *             }
 *         }
 *         list insufficient-data {
 *             key "url";
 *             leaf url {
 *                 type string;
 *             }
 *         }
 *         list alarm {
 *             key "url";
 *             leaf url {
 *                 type string;
 *             }
 *         }
 *     }
 *     leaf repeat {
 *         type repeat;
 *     }
 *     leaf enabled {
 *         type enabled;
 *     }
 *     leaf severity {
 *         type alarm-severity-type;
 *     }
 *     leaf metric {
 *         type alarm-metric-type;
 *     }
 *     leaf statistic {
 *         type alarm-statistic-type;
 *     }
 *     leaf operation {
 *         type alarm-operation-type;
 *     }
 *     leaf value {
 *         type decimal64;
 *     }
 *     leaf period {
 *         type uint32;
 *     }
 *     leaf evaluations {
 *         type uint32;
 *     }
 *     uses alarm;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu/alarm</i>
 * 
 * <p>To create instances of this class use {@link AlarmBuilder}.
 * @see AlarmBuilder
 * @see AlarmKey
 *
 */
public interface Alarm
    extends
    ChildOf<Vdu>,
    Augmentable<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm>,
    ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.Alarm,
    Identifiable<AlarmKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/vnfd-base",
        "2017-02-28", "alarm").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.vdu.AlarmKey</code> <code>key</code>, or <code>null</code> if not present
     */
    AlarmKey getKey();

}

