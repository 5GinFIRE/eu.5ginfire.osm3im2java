package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.VolumeSource;

import java.math.BigInteger;

/**
 * Grouping for Volume-info
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping volume-info {
 *     leaf description {
 *         type string;
 *     }
 *     leaf size {
 *         type uint64;
 *     }
 *     choice volume-source {
 *         case ephemeral {
 *             leaf ephemeral {
 *                 type empty;
 *             }
 *         }
 *         case image {
 *             leaf image {
 *                 type string;
 *             }
 *             leaf image-checksum {
 *                 type string;
 *             }
 *         }
 *     }
 *     leaf device-bus {
 *         type enumeration;
 *     }
 *     leaf device-type {
 *         type enumeration;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/volume-info</i>
 *
 */
public interface VolumeInfo
    extends
    DataObject
{


    public enum DeviceBus {
        Ide(0, "ide"),
        
        Usb(1, "usb"),
        
        Virtio(2, "virtio"),
        
        Scsi(3, "scsi")
        ;
    
        private static final java.util.Map<java.lang.Integer, DeviceBus> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, DeviceBus> b = com.google.common.collect.ImmutableMap.builder();
            for (DeviceBus enumItem : DeviceBus.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private DeviceBus(int value, java.lang.String name) {
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
         * @return corresponding DeviceBus item
         */
        public static DeviceBus forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    public enum DeviceType {
        Disk(0, "disk"),
        
        Cdrom(1, "cdrom"),
        
        Floppy(2, "floppy"),
        
        Lun(3, "lun")
        ;
    
        private static final java.util.Map<java.lang.Integer, DeviceType> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, DeviceType> b = com.google.common.collect.ImmutableMap.builder();
            for (DeviceType enumItem : DeviceType.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private DeviceType(int value, java.lang.String name) {
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
         * @return corresponding DeviceType item
         */
        public static DeviceType forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "volume-info").intern();

    /**
     * Description for Volume
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    java.lang.String getDescription();
    
    /**
     * Size of disk in GB
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>size</code>, or <code>null</code> if not present
     */
    BigInteger getSize();
    
    /**
     * Defines the source of the volume. Possible options are1. Ephemeral -- Empty 
     * disk2. Image -- Refer to image to be used for volume3. Volume -- Reference of 
     * pre-existing volume to be used
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.VolumeSource</code> <code>volumeSource</code>, or <code>null</code> if not present
     */
    VolumeSource getVolumeSource();
    
    /**
     * Type of disk-bus on which this disk is exposed to guest
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VolumeInfo.DeviceBus</code> <code>deviceBus</code>, or <code>null</code> if not present
     */
    DeviceBus getDeviceBus();
    
    /**
     * The type of device as exposed to guest
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VolumeInfo.DeviceType</code> <code>deviceType</code>, or <code>null</code> if not present
     */
    DeviceType getDeviceType();

}

