package ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.vlr.rev170208.Project1;
import ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vlr</b>
 * <pre>
 * container vlr-catalog {
 *     leaf schema-version {
 *         type schema-version;
 *     }
 *     list vlr {
 *         key "id";
 *         leaf id {
 *             type uuid;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         leaf nsr-id-ref {
 *             type uuid;
 *         }
 *         leaf vld-ref {
 *             type string;
 *         }
 *         leaf res-id {
 *             type uuid;
 *         }
 *         leaf short-name {
 *             type string;
 *         }
 *         leaf vendor {
 *             type string;
 *         }
 *         leaf description {
 *             type string;
 *         }
 *         leaf version {
 *             type string;
 *         }
 *         leaf type {
 *             type virtual-link-type;
 *         }
 *         leaf root-bandwidth {
 *             type uint64;
 *         }
 *         leaf leaf-bandwidth {
 *             type uint64;
 *         }
 *         leaf create-time {
 *             type uint32;
 *         }
 *         leaf uptime {
 *             type uint32;
 *         }
 *         leaf network-id {
 *             type string;
 *         }
 *         leaf vim-network-name {
 *             type string;
 *         }
 *         container provider-network {
 *             leaf physical-network {
 *                 type string;
 *             }
 *             leaf segmentation_id {
 *                 type uint32;
 *             }
 *         }
 *         container ip-profile-params {
 *             leaf ip-version {
 *                 type ip-version;
 *             }
 *             leaf subnet-address {
 *                 type ip-prefix;
 *             }
 *             leaf gateway-address {
 *                 type ip-address;
 *             }
 *             leaf security-group {
 *                 type string;
 *             }
 *             list dns-server {
 *                 key "address";
 *                 leaf address {
 *                     type ip-address;
 *                 }
 *             }
 *             container dhcp-params {
 *                 leaf enabled {
 *                     type enabled;
 *                 }
 *                 leaf start-address {
 *                     type ip-address;
 *                 }
 *                 leaf count {
 *                     type uint32;
 *                 }
 *             }
 *             leaf subnet-prefix-pool {
 *                 type string;
 *             }
 *         }
 *         leaf status {
 *             type enumeration;
 *         }
 *         leaf operational-status {
 *             type enumeration;
 *         }
 *         uses ip-profile-info;
 *         uses provider-network;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vlr/project/(urn:ietf:params:xml:ns:yang:nfvo:vlr?revision=2017-02-08)vlr-catalog</i>
 * 
 * <p>To create instances of this class use {@link VlrCatalogBuilder}.
 * @see VlrCatalogBuilder
 *
 */
public interface VlrCatalog
    extends
    ChildOf<Project1>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.VlrCatalog>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vlr",
        "2017-02-08", "vlr-catalog").intern();

    /**
     * Schema version for the VLR. If unspecified, it assumes v3.0
     *
     *
     *
     * @return <code>java.lang.String</code> <code>schemaVersion</code>, or <code>null</code> if not present
     */
    java.lang.String getSchemaVersion();
    
    /**
     * @return <code>java.util.List</code> <code>vlr</code>, or <code>null</code> if not present
     */
    List<Vlr> getVlr();

}

