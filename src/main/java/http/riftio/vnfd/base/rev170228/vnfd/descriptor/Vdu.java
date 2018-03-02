package http.riftio.vnfd.base.rev170228.vnfd.descriptor;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import http.riftio.vnfd.base.rev170228.VnfdDescriptor;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.VduBuilder.VduImpl;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.CloudInitInput;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.InternalConnectionPoint;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.VduConfiguration;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Volumes;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.GuestEpa;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HostEpa;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HypervisorEpa;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ImageProperties;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.SupplementalBootData;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VmFlavor;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VswitchEpa;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.VnfdBuilder.VnfdImpl;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

import java.math.BigInteger;
import java.util.List;

/**
 * List of Virtual Deployment Units
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list vdu {
 *     key "id";
 *     leaf id {
 *         type string;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf description {
 *         type string;
 *     }
 *     leaf count {
 *         type uint64;
 *     }
 *     leaf mgmt-vpci {
 *         type string;
 *     }
 *     container vm-flavor {
 *         leaf vcpu-count {
 *             type uint16;
 *         }
 *         leaf memory-mb {
 *             type uint64;
 *         }
 *         leaf storage-gb {
 *             type uint64;
 *         }
 *     }
 *     container guest-epa {
 *         leaf trusted-execution {
 *             type boolean;
 *         }
 *         leaf mempage-size {
 *             type enumeration;
 *         }
 *         leaf cpu-pinning-policy {
 *             type cpu-pinning-policy;
 *         }
 *         leaf cpu-thread-pinning-policy {
 *             type enumeration;
 *         }
 *         list pcie-device {
 *             key "device-id";
 *             leaf device-id {
 *                 type string;
 *             }
 *             leaf count {
 *                 type uint64;
 *             }
 *         }
 *         choice numa-policy {
 *             case numa-aware {
 *                 container numa-node-policy {
 *                     leaf node-cnt {
 *                         type uint16;
 *                     }
 *                     leaf mem-policy {
 *                         type enumeration;
 *                     }
 *                     list node {
 *                         key "id";
 *                         leaf id {
 *                             type uint64;
 *                         }
 *                         list vcpu {
 *                             key "id";
 *                             leaf id {
 *                                 type uint64;
 *                             }
 *                         }
 *                         leaf memory-mb {
 *                             type uint64;
 *                         }
 *                         choice om-numa-type {
 *                             case cores {
 *                                 leaf num-cores {
 *                                     type uint8;
 *                                 }
 *                             }
 *                             case paired-threads {
 *                                 container paired-threads {
 *                                     leaf num-paired-threads {
 *                                         type uint8;
 *                                     }
 *                                     list paired-thread-ids {
 *                                         key "thread-a";
 *                                         leaf thread-a {
 *                                             type uint8;
 *                                         }
 *                                         leaf thread-b {
 *                                             type uint8;
 *                                         }
 *                                     }
 *                                 }
 *                             }
 *                             case threads {
 *                                 leaf num-threads {
 *                                     type uint8;
 *                                 }
 *                             }
 *                         }
 *                     }
 *                 }
 *             }
 *             case numa-unaware {
 *                 leaf numa-unaware {
 *                     type empty;
 *                 }
 *             }
 *         }
 *     }
 *     container vswitch-epa {
 *         leaf ovs-acceleration {
 *             type enumeration;
 *         }
 *         leaf ovs-offload {
 *             type enumeration;
 *         }
 *     }
 *     container hypervisor-epa {
 *         leaf type {
 *             type enumeration;
 *         }
 *         leaf version {
 *             type string;
 *         }
 *     }
 *     container host-epa {
 *         leaf cpu-model {
 *             type enumeration;
 *         }
 *         leaf cpu-arch {
 *             type enumeration;
 *         }
 *         leaf cpu-vendor {
 *             type enumeration;
 *         }
 *         leaf cpu-socket-count {
 *             type uint64;
 *         }
 *         leaf cpu-core-count {
 *             type uint64;
 *         }
 *         leaf cpu-core-thread-count {
 *             type uint64;
 *         }
 *         list cpu-feature {
 *             key "feature";
 *             leaf feature {
 *                 type cpu-feature-type;
 *             }
 *         }
 *         leaf om-cpu-model-string {
 *             type string;
 *         }
 *         list om-cpu-feature {
 *             key "feature";
 *             leaf feature {
 *                 type string;
 *             }
 *         }
 *     }
 *     list alarm {
 *         key "alarm-id";
 *         leaf alarm-id {
 *             type string;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         leaf description {
 *             type string;
 *         }
 *         leaf vdur-id {
 *             type string;
 *         }
 *         container actions {
 *             list ok {
 *                 key "url";
 *                 leaf url {
 *                     type string;
 *                 }
 *             }
 *             list insufficient-data {
 *                 key "url";
 *                 leaf url {
 *                     type string;
 *                 }
 *             }
 *             list alarm {
 *                 key "url";
 *                 leaf url {
 *                     type string;
 *                 }
 *             }
 *         }
 *         leaf repeat {
 *             type repeat;
 *         }
 *         leaf enabled {
 *             type enabled;
 *         }
 *         leaf severity {
 *             type alarm-severity-type;
 *         }
 *         leaf metric {
 *             type alarm-metric-type;
 *         }
 *         leaf statistic {
 *             type alarm-statistic-type;
 *         }
 *         leaf operation {
 *             type alarm-operation-type;
 *         }
 *         leaf value {
 *             type decimal64;
 *         }
 *         leaf period {
 *             type uint32;
 *         }
 *         leaf evaluations {
 *             type uint32;
 *         }
 *         uses alarm;
 *     }
 *     leaf image {
 *         type string;
 *     }
 *     leaf image-checksum {
 *         type string;
 *     }
 *     list alternative-images {
 *         key "vim-type";
 *         leaf vim-type {
 *             type string;
 *         }
 *         leaf image {
 *             type string;
 *         }
 *         leaf image-checksum {
 *             type string;
 *         }
 *         uses image-properties;
 *     }
 *     container vdu-configuration {
 *         choice config-method {
 *             case juju {
 *                 container juju {
 *                     leaf charm {
 *                         type string;
 *                     }
 *                     leaf proxy {
 *                         type proxy;
 *                     }
 *                     container vca-relationships {
 *                         list relation {
 *                             key "requires" "provides";
 *                             leaf requires {
 *                                 type string;
 *                             }
 *                             leaf provides {
 *                                 type string;
 *                             }
 *                         }
 *                     }
 *                     uses vca-relationships;
 *                 }
 *             }
 *             case script {
 *                 container script {
 *                     leaf script-type {
 *                         type enumeration;
 *                     }
 *                 }
 *             }
 *         }
 *         list config-primitive {
 *             key "name";
 *             leaf name {
 *                 type string;
 *             }
 *             list parameter {
 *                 key "name";
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf data-type {
 *                     type parameter-data-type;
 *                 }
 *                 leaf mandatory {
 *                     type mandatory;
 *                 }
 *                 leaf default-value {
 *                     type string;
 *                 }
 *                 leaf parameter-pool {
 *                     type string;
 *                 }
 *                 leaf read-only {
 *                     type read-only;
 *                 }
 *                 leaf hidden {
 *                     type hidden;
 *                 }
 *                 uses primitive-parameter;
 *             }
 *             leaf user-defined-script {
 *                 type string;
 *             }
 *         }
 *         list initial-config-primitive {
 *             key "seq";
 *             leaf seq {
 *                 type uint64;
 *             }
 *             choice primitive-type {
 *                 case primitive-definition {
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf user-defined-script {
 *                         type string;
 *                     }
 *                     list parameter {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                     }
 *                 }
 *             }
 *         }
 *         uses vca-configuration;
 *     }
 *     choice cloud-init-input {
 *         case filename {
 *             leaf cloud-init-file {
 *                 type string;
 *             }
 *         }
 *         case inline {
 *             leaf cloud-init {
 *                 type string;
 *             }
 *         }
 *     }
 *     container supplemental-boot-data {
 *         leaf boot-data-drive {
 *             type boot-data-drive;
 *         }
 *         list config-file {
 *             key "source";
 *             leaf source {
 *                 type string;
 *             }
 *             leaf dest {
 *                 type string;
 *             }
 *         }
 *         uses config-file;
 *     }
 *     list internal-connection-point {
 *         key "id";
 *         leaf name {
 *             type string;
 *         }
 *         leaf id {
 *             type string;
 *         }
 *         leaf short-name {
 *             type string;
 *         }
 *         leaf type {
 *             type connection-point-type;
 *         }
 *         leaf port-security-enabled {
 *             type boolean;
 *         }
 *         leaf internal-vld-ref {
 *             type leafref;
 *         }
 *         uses common-connection-point;
 *     }
 *     list interface {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf position {
 *             type uint32;
 *         }
 *         leaf type {
 *             type type;
 *         }
 *         leaf mac-address {
 *             type string;
 *         }
 *         choice connection-point-type {
 *             case external {
 *                 leaf external-connection-point-ref {
 *                     type string;
 *                 }
 *             }
 *             case internal {
 *                 leaf internal-connection-point-ref {
 *                     type string;
 *                 }
 *             }
 *         }
 *         container virtual-interface {
 *             leaf type {
 *                 type type;
 *             }
 *             leaf vpci {
 *                 type string;
 *             }
 *             leaf bandwidth {
 *                 type uint64;
 *             }
 *         }
 *         uses virtual-interface;
 *     }
 *     list volumes {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf description {
 *             type string;
 *         }
 *         leaf size {
 *             type uint64;
 *         }
 *         choice volume-source {
 *             case ephemeral {
 *                 leaf ephemeral {
 *                     type empty;
 *                 }
 *             }
 *             case image {
 *                 leaf image {
 *                     type string;
 *                 }
 *                 leaf image-checksum {
 *                     type string;
 *                 }
 *             }
 *         }
 *         leaf device-bus {
 *             type enumeration;
 *         }
 *         leaf device-type {
 *             type enumeration;
 *         }
 *         uses volume-info;
 *     }
 *     uses guest-epa;
 *     uses supplemental-boot-data;
 *     uses host-epa;
 *     uses vm-flavor;
 *     uses image-properties;
 *     uses vswitch-epa;
 *     uses hypervisor-epa;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu</i>
 * 
 * <p>To create instances of this class use {@link VduBuilder}.
 * @see VduBuilder
 * @see VduKey
 *
 */
@JsonDeserialize(as = VduImpl.class)
@JsonIgnoreProperties({"cloud-init-file"})
public interface Vdu
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu>,
    GuestEpa,
    SupplementalBootData,
    HostEpa,
    VmFlavor,
    ImageProperties,
    VswitchEpa,
    HypervisorEpa,
    Identifiable<VduKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/vnfd-base",
        "2017-02-28", "vdu").intern();

    /**
     * Unique id for the VDU
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    java.lang.String getId();
    
    /**
     * Unique name for the VDU
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Description of the VDU.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    java.lang.String getDescription();
    
    /**
     * Number of instances of VDU
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>count</code>, or <code>null</code> if not present
     */
    BigInteger getCount();
    
    /**
     * Specifies the virtual PCI address. Expressed inthe following format 
     * dddd:dd:dd.d. For example0000:00:12.0. This information can be used topass as 
     * metadata during the VM creation.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>mgmtVpci</code>, or <code>null</code> if not present
     */
    java.lang.String getMgmtVpci();
    
    /**
     * @return <code>java.util.List</code> <code>alarm</code>, or <code>null</code> if not present
     */
    List<Alarm> getAlarm();
    
    /**
     * List of alternative images per VIM type.Different images can be used for 
     * specific types of VIMs insteadof the default image. This allows deployments in 
     * sites where theimage identifier in the VIM is given by the VIM provider 
     * andcannot be modified.If an alternative image is specified for a VIM type, it 
     * will prevailover the default image
     *
     *
     *
     * @return <code>java.util.List</code> <code>alternativeImages</code>, or <code>null</code> if not present
     */
    List<AlternativeImages> getAlternativeImages();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.vdu.VduConfiguration</code> <code>vduConfiguration</code>, or <code>null</code> if not present
     */
    VduConfiguration getVduConfiguration();
    
    /**
     * Indicates how the contents of cloud-init script are provided.There are 2 choices
     * - inline or in a file
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.vdu.CloudInitInput</code> <code>cloudInitInput</code>, or <code>null</code> if not present
     */
    CloudInitInput getCloudInitInput();
    
    /**
     * List for internal connection points. Each VNFChas zero or more internal 
     * connection points.Internal connection points are used for connectingthe VNF with
     * components internal to the VNF. If a VNFhas only one VNFC, it may not have any 
     * internalconnection points.
     *
     *
     *
     * @return <code>java.util.List</code> <code>internalConnectionPoint</code>, or <code>null</code> if not present
     */
    List<InternalConnectionPoint> getInternalConnectionPoint();
    
    /**
     * List of Interfaces (external and internal) for the VNF
     *
     *
     *
     * @return <code>java.util.List</code> <code>interface</code>, or <code>null</code> if not present
     */
    List<Interface> getInterface();
    
    /**
     * @return <code>java.util.List</code> <code>volumes</code>, or <code>null</code> if not present
     */
    List<Volumes> getVolumes();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.VduKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VduKey getKey();

}

