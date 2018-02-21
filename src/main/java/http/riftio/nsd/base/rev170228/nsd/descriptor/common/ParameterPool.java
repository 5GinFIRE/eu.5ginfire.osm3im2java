package http.riftio.nsd.base.rev170228.nsd.descriptor.common;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.nsd.base.rev170228.NsdDescriptorCommon;
import http.riftio.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Pool of parameter values which must bepulled from during configuration
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list parameter-pool {
 *     key "name";
 *     leaf name {
 *         type string;
 *     }
 *     container range {
 *         leaf start-value {
 *             type uint32;
 *         }
 *         leaf end-value {
 *             type uint32;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/parameter-pool</i>
 * 
 * <p>To create instances of this class use {@link ParameterPoolBuilder}.
 * @see ParameterPoolBuilder
 * @see ParameterPoolKey
 *
 */
public interface ParameterPool
    extends
    ChildOf<NsdDescriptorCommon>,
    Augmentable<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ParameterPool>,
    Identifiable<ParameterPoolKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/nsd-base",
        "2017-02-28", "parameter-pool").intern();

    /**
     * Name of the configuration value pool
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Create a range of values to populate the pool with
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range</code> <code>range</code>, or <code>null</code> if not present
     */
    Range getRange();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.ParameterPoolKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ParameterPoolKey getKey();

}

