package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.CpuFeature;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.OmCpuFeature;

import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Specifies the host level EPA attributes.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container host-epa {
 *     leaf cpu-model {
 *         type enumeration;
 *     }
 *     leaf cpu-arch {
 *         type enumeration;
 *     }
 *     leaf cpu-vendor {
 *         type enumeration;
 *     }
 *     leaf cpu-socket-count {
 *         type uint64;
 *     }
 *     leaf cpu-core-count {
 *         type uint64;
 *     }
 *     leaf cpu-core-thread-count {
 *         type uint64;
 *     }
 *     list cpu-feature {
 *         key "feature";
 *         leaf feature {
 *             type cpu-feature-type;
 *         }
 *     }
 *     leaf om-cpu-model-string {
 *         type string;
 *     }
 *     list om-cpu-feature {
 *         key "feature";
 *         leaf feature {
 *             type string;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/host-epa/host-epa</i>
 * 
 * <p>To create instances of this class use {@link HostEpaBuilder}.
 * @see HostEpaBuilder
 *
 */
public interface HostEpa
    extends
    ChildOf<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HostEpa>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa>
{


    public enum CpuModel {
        PREFERWESTMERE(0, "PREFER_WESTMERE"),
        
        REQUIREWESTMERE(1, "REQUIRE_WESTMERE"),
        
        PREFERSANDYBRIDGE(2, "PREFER_SANDYBRIDGE"),
        
        REQUIRESANDYBRIDGE(3, "REQUIRE_SANDYBRIDGE"),
        
        PREFERIVYBRIDGE(4, "PREFER_IVYBRIDGE"),
        
        REQUIREIVYBRIDGE(5, "REQUIRE_IVYBRIDGE"),
        
        PREFERHASWELL(6, "PREFER_HASWELL"),
        
        REQUIREHASWELL(7, "REQUIRE_HASWELL"),
        
        PREFERBROADWELL(8, "PREFER_BROADWELL"),
        
        REQUIREBROADWELL(9, "REQUIRE_BROADWELL"),
        
        PREFERNEHALEM(10, "PREFER_NEHALEM"),
        
        REQUIRENEHALEM(11, "REQUIRE_NEHALEM"),
        
        PREFERPENRYN(12, "PREFER_PENRYN"),
        
        REQUIREPENRYN(13, "REQUIRE_PENRYN"),
        
        PREFERCONROE(14, "PREFER_CONROE"),
        
        REQUIRECONROE(15, "REQUIRE_CONROE"),
        
        PREFERCORE2DUO(16, "PREFER_CORE2DUO"),
        
        REQUIRECORE2DUO(17, "REQUIRE_CORE2DUO")
        ;
    
        private static final java.util.Map<java.lang.Integer, CpuModel> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, CpuModel> b = com.google.common.collect.ImmutableMap.builder();
            for (CpuModel enumItem : CpuModel.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private CpuModel(int value, java.lang.String name) {
            this.value = value;
            this.name = name;
        }
    
        /**
         * Returns the name of the enumeration item as it is specified in the input yang.
         *
         * @return the name of the enumeration item as it is specified in the input yang
         */
        public java.lang.String getName() {
            return name;
        }
    
        /**
         * @return integer value
         */
        public int getIntValue() {
            return value;
        }
    
        /**
         * @param valueArg integer value
         * @return corresponding CpuModel item
         */
        public static CpuModel forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    public enum CpuArch {
        PREFERX86(0, "PREFER_X86"),
        
        REQUIREX86(1, "REQUIRE_X86"),
        
        PREFERX8664(2, "PREFER_X86_64"),
        
        REQUIREX8664(3, "REQUIRE_X86_64"),
        
        PREFERI686(4, "PREFER_I686"),
        
        REQUIREI686(5, "REQUIRE_I686"),
        
        PREFERIA64(6, "PREFER_IA64"),
        
        REQUIREIA64(7, "REQUIRE_IA64"),
        
        PREFERARMV7(8, "PREFER_ARMV7"),
        
        REQUIREARMV7(9, "REQUIRE_ARMV7"),
        
        PREFERARMV8(10, "PREFER_ARMV8"),
        
        REQUIREARMV8(11, "REQUIRE_ARMV8")
        ;
    
        private static final java.util.Map<java.lang.Integer, CpuArch> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, CpuArch> b = com.google.common.collect.ImmutableMap.builder();
            for (CpuArch enumItem : CpuArch.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private CpuArch(int value, java.lang.String name) {
            this.value = value;
            this.name = name;
        }
    
        /**
         * Returns the name of the enumeration item as it is specified in the input yang.
         *
         * @return the name of the enumeration item as it is specified in the input yang
         */
        public java.lang.String getName() {
            return name;
        }
    
        /**
         * @return integer value
         */
        public int getIntValue() {
            return value;
        }
    
        /**
         * @param valueArg integer value
         * @return corresponding CpuArch item
         */
        public static CpuArch forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    public enum CpuVendor {
        PREFERINTEL(0, "PREFER_INTEL"),
        
        REQUIREINTEL(1, "REQUIRE_INTEL"),
        
        PREFERAMD(2, "PREFER_AMD"),
        
        REQUIREAMD(3, "REQUIRE_AMD")
        ;
    
        private static final java.util.Map<java.lang.Integer, CpuVendor> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, CpuVendor> b = com.google.common.collect.ImmutableMap.builder();
            for (CpuVendor enumItem : CpuVendor.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private CpuVendor(int value, java.lang.String name) {
            this.value = value;
            this.name = name;
        }
    
        /**
         * Returns the name of the enumeration item as it is specified in the input yang.
         *
         * @return the name of the enumeration item as it is specified in the input yang
         */
        public java.lang.String getName() {
            return name;
        }
    
        /**
         * @return integer value
         */
        public int getIntValue() {
            return value;
        }
    
        /**
         * @param valueArg integer value
         * @return corresponding CpuVendor item
         */
        public static CpuVendor forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "host-epa").intern();

    /**
     * Host CPU model. Examples include: SandyBridge,IvyBridge
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa.CpuModel</code> <code>cpuModel</code>, or <code>null</code> if not present
     */
    CpuModel getCpuModel();
    
    /**
     * Host CPU architecture.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa.CpuArch</code> <code>cpuArch</code>, or <code>null</code> if not present
     */
    CpuArch getCpuArch();
    
    /**
     * Host CPU Vendor.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa.CpuVendor</code> <code>cpuVendor</code>, or <code>null</code> if not present
     */
    CpuVendor getCpuVendor();
    
    /**
     * Number of sockets on the host.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>cpuSocketCount</code>, or <code>null</code> if not present
     */
    BigInteger getCpuSocketCount();
    
    /**
     * Number of cores on the host.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>cpuCoreCount</code>, or <code>null</code> if not present
     */
    BigInteger getCpuCoreCount();
    
    /**
     * Number of threads per cores on the host.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>cpuCoreThreadCount</code>, or <code>null</code> if not present
     */
    BigInteger getCpuCoreThreadCount();
    
    /**
     * List of CPU features.
     *
     *
     *
     * @return <code>java.util.List</code> <code>cpuFeature</code>, or <code>null</code> if not present
     */
    List<CpuFeature> getCpuFeature();
    
    /**
     * OpenMANO CPU model string
     *
     *
     *
     * @return <code>java.lang.String</code> <code>omCpuModelString</code>, or <code>null</code> if not present
     */
    java.lang.String getOmCpuModelString();
    
    /**
     * List of OpenMANO CPU features
     *
     *
     *
     * @return <code>java.util.List</code> <code>omCpuFeature</code>, or <code>null</code> if not present
     */
    List<OmCpuFeature> getOmCpuFeature();

}

