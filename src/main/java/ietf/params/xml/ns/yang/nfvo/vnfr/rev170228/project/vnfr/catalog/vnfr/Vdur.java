package ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Uri;
import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.GuestEpa;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HostEpa;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HypervisorEpa;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.SupplementalBootData;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VmFlavor;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VswitchEpa;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.PlacementGroupInfo;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.VduOperationalStatus;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Interface;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.InternalConnectionPoint;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

import java.util.List;

/**
 * List of Virtual Deployment Units
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * list vdur {
 *     key "id";
 *     leaf id {
 *         type uuid;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf unique-short-name {
 *         type string;
 *     }
 *     leaf vdu-id-ref {
 *         type leafref;
 *     }
 *     leaf vim-id {
 *         type string;
 *     }
 *     leaf flavor-id {
 *         type string;
 *     }
 *     leaf image-id {
 *         type string;
 *     }
 *     leaf management-ip {
 *         type ip-address;
 *     }
 *     leaf vm-management-ip {
 *         type ip-address;
 *     }
 *     leaf console-url {
 *         type uri;
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
 *     list volumes {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf volume-id {
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
 *         leaf ip-address {
 *             type ip-address;
 *         }
 *         leaf mac-address {
 *             type string;
 *         }
 *         leaf connection-point-id {
 *             type string;
 *         }
 *         list virtual-cps {
 *             key "name";
 *             leaf ip-address {
 *                 type ip-address;
 *             }
 *             leaf mac-address {
 *                 type string;
 *             }
 *             leaf connection-point-id {
 *                 type string;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             leaf id {
 *                 type string;
 *             }
 *             leaf short-name {
 *                 type string;
 *             }
 *             leaf type {
 *                 type connection-point-type;
 *             }
 *             leaf port-security-enabled {
 *                 type boolean;
 *             }
 *             uses common-connection-point;
 *         }
 *         uses common-connection-point;
 *         uses associated-virtual-cps;
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
 *                 type enumeration;
 *             }
 *             leaf bandwidth {
 *                 type uint64;
 *             }
 *             leaf ovs-offload {
 *                 type enumeration;
 *             }
 *             leaf vendor-id {
 *                 type string;
 *             }
 *             leaf datapath-library {
 *                 type string;
 *             }
 *             leaf provider-network-name {
 *                 type string;
 *             }
 *         }
 *         uses virtual-interface;
 *     }
 *     leaf operational-status {
 *         type vdu-operational-status;
 *     }
 *     list placement-groups-info {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf requirement {
 *             type string;
 *         }
 *         leaf strategy {
 *             type strategy;
 *         }
 *         leaf cloud-type {
 *             type cloud-account-type;
 *         }
 *         choice cloud-provider {
 *             case aws {
 *                 leaf aws-construct {
 *                     type empty;
 *                 }
 *             }
 *             case cloudsim {
 *                 leaf cloudsim-construct {
 *                     type empty;
 *                 }
 *             }
 *             case mock {
 *                 leaf mock-construct {
 *                     type empty;
 *                 }
 *             }
 *             case openmano {
 *                 leaf openmano-construct {
 *                     type empty;
 *                 }
 *             }
 *             case openstack {
 *                 container availability-zone {
 *                     leaf name {
 *                         type string;
 *                     }
 *                 }
 *                 container server-group {
 *                     leaf name {
 *                         type string;
 *                     }
 *                 }
 *                 list host-aggregate {
 *                     key "metadata-key";
 *                     leaf metadata-key {
 *                         type string;
 *                     }
 *                     leaf metadata-value {
 *                         type string;
 *                     }
 *                 }
 *             }
 *             case vsphere {
 *                 leaf vsphere-construct {
 *                     type empty;
 *                 }
 *             }
 *         }
 *         uses placement-group-info;
 *         uses placement-group-input;
 *     }
 *     uses guest-epa;
 *     uses supplemental-boot-data;
 *     uses host-epa;
 *     uses vm-flavor;
 *     uses vswitch-epa;
 *     uses placement-group-info;
 *     uses hypervisor-epa;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:ietf:params:xml:ns:yang:nfvo:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/vdur</i>
 * 
 * <p>To create instances of this class use {@link VdurBuilder}.
 * @see VdurBuilder
 * @see VdurKey
 *
 */
public interface Vdur
    extends
    ChildOf<Vnfr>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur>,
    GuestEpa,
    SupplementalBootData,
    HostEpa,
    VmFlavor,
    VswitchEpa,
    PlacementGroupInfo,
    HypervisorEpa,
    Identifiable<VdurKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfr",
        "2017-02-28", "vdur").intern();

    /**
     * Unique id for the VDU
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>id</code>, or <code>null</code> if not present
     */
    Uuid getId();
    
    /**
     * name of the instantiated VDUR
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Short Unique name of the VDUThis will be of the format NSR 
     * name-ShortnedString-VDUnameNSR name and VDU name shall be constrained to 10 
     * characters
     *
     *
     *
     * @return <code>java.lang.String</code> <code>uniqueShortName</code>, or <code>null</code> if not present
     */
    java.lang.String getUniqueShortName();
    
    /**
     * @return <code>java.lang.String</code> <code>vduIdRef</code>, or <code>null</code> if not present
     */
    java.lang.String getVduIdRef();
    
    /**
     * Allocated VM resource id
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vimId</code>, or <code>null</code> if not present
     */
    java.lang.String getVimId();
    
    /**
     * VIM assigned flavor id
     *
     *
     *
     * @return <code>java.lang.String</code> <code>flavorId</code>, or <code>null</code> if not present
     */
    java.lang.String getFlavorId();
    
    /**
     * VIM assigned image id
     *
     *
     *
     * @return <code>java.lang.String</code> <code>imageId</code>, or <code>null</code> if not present
     */
    java.lang.String getImageId();
    
    /**
     * Management IP address
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>managementIp</code>, or <code>null</code> if not present
     */
    IpAddress getManagementIp();
    
    /**
     * VM Private Management IP address
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>vmManagementIp</code>, or <code>null</code> if not present
     */
    IpAddress getVmManagementIp();
    
    /**
     * Console URL for this VDU, if available
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Uri</code> <code>consoleUrl</code>, or <code>null</code> if not present
     */
    Uri getConsoleUrl();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration</code> <code>vduConfiguration</code>, or <code>null</code> if not present
     */
    VduConfiguration getVduConfiguration();
    
    /**
     * @return <code>java.util.List</code> <code>volumes</code>, or <code>null</code> if not present
     */
    List<Volumes> getVolumes();
    
    /**
     * List for internal connection points. Each VNFChas zero or more internal 
     * connection points.Internal connection points are used for connectingthe VNF 
     * components internal to the VNF. If a VNFhas only one VNFC, it may not have any 
     * internalconnection points.
     *
     *
     *
     * @return <code>java.util.List</code> <code>internalConnectionPoint</code>, or <code>null</code> if not present
     */
    List<InternalConnectionPoint> getInternalConnectionPoint();
    
    /**
     * List of interfaces (internal and external) for the VNF
     *
     *
     *
     * @return <code>java.util.List</code> <code>interface</code>, or <code>null</code> if not present
     */
    List<Interface> getInterface();
    
    /**
     * The operational status of the VDU init : The VDU has just started. vm-init-phase
     * : The VDUs in the VNF is being created in VIM. vm-alloc-pending : The VM alloc 
     * is pending in VIM running : The VDU is active in VM upgrading : The VDU is being
     * upgraded (EXPERIMENTAL) terminate : The VDU is being terminated 
     * vm-terminate-phase : The VDU in the VNF is being terminated in VIM. terminated :
     * The VDU is in the terminated state. failed : The VDU instantiation failed.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.VduOperationalStatus</code> <code>operationalStatus</code>, or <code>null</code> if not present
     */
    VduOperationalStatus getOperationalStatus();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.VdurKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VdurKey getKey();

}

