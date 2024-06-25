export var SiteConfigJSON = JSON.parse(`{
    "sites v4.9": {
        "my-site-name": {
            "description": "Description of the site.",
            "tags": null,
            "admin_state": "active",
            "address": {
                "street": "500 W. Madison Street",
                "street2": null,
                "city": null,
                "state": null,
                "post_code": null,
                "country": "US"
            },
            "location": {
                "longitude": 0,
                "latitude": 0,
                "description": null
            },
            "policy_set_id": null,
            "element_cluster_role": "SPOKE",
            "security_policyset_id": null,
            "service_binding": "Preset Domain",
            "network_policysetstack_id": "Default Path Simple Stack (Simple)",
            "priority_policysetstack_id": "Default QoS Simple Stack (Simple)",
            "nat_policysetstack_id": "DefaultNAT-PolicySetStack",
            "extended_tags": null,
            "security_policysetstack_id": null,
            "multicast_peer_group_id": null,
            "vrf_context_profile_id": "Global Profile",
            "perfmgmt_policysetstack_id": "Default Performance Policy Set Stack",
            "waninterfaces v2.7": {
                "Backup5GWithVerizon": {
                    "description": "",
                    "tags": null,
                    "network_id": "Verizon",
                    "link_bw_down": 50,
                    "link_bw_up": 50,
                    "bw_config_mode": "auto",
                    "bfd_mode": "aggressive",
                    "label_id": "Backup 5G INET",
                    "lqm_enabled": true,
                    "bwc_enabled": true,
                    "cost": 128,
                    "lqm_config": null,
                    "vpnlink_configuration": null,
                    "type": "publicwan",
                    "use_for_controller_connections": false,
                    "use_for_application_reachability_probes": false,
                    "use_lqm_for_non_hub_paths": false,
                    "network_type": "publicwan"
                },
                "PrimaryCircuitWithATT": {
                    "description": "",
                    "tags": null,
                    "network_id": "AT&T",
                    "link_bw_down": 50,
                    "link_bw_up": 50,
                    "bw_config_mode": "auto",
                    "bfd_mode": "aggressive",
                    "label_id": "1st Active INET",
                    "lqm_enabled": true,
                    "bwc_enabled": true,
                    "cost": 128,
                    "lqm_config": null,
                    "vpnlink_configuration": null,
                    "type": "publicwan",
                    "use_for_controller_connections": true,
                    "use_for_application_reachability_probes": false,
                    "use_lqm_for_non_hub_paths": false,
                    "network_type": "publicwan"
                }
            },
            "spokeclusters v2.0": {
                "HA-Branch": {
                    "description": "",
                    "tags": null,
                    "preempt": true,
                    "advertisement_interval": 2
                }
            },
            "dhcpservers v2.3": [
                {
                    "disabled": false,
                    "tags": null,
                    "description": null,
                    "network_context_id": null,
                    "subnet": "10.99.98.0/25",
                    "gateway": "10.99.98.62",
                    "broadcast_address": "10.99.98.127",
                    "domain_name": "core.mdc.local",
                    "dns_servers": [
                        "8.8.8.8",
                        "4.2.2.2"
                    ],
                    "default_lease_time": 43200,
                    "max_lease_time": 86400,
                    "ip_ranges": [
                        {
                            "start_ip": "10.99.98.48",
                            "end_ip": "10.99.98.58"
                        }
                    ],
                    "static_mappings": null,
                    "custom_options": null,
                    "address_family": "ipv4",
                    "vrf_context_id": "Global"
                },
                {
                    "disabled": false,
                    "tags": null,
                    "description": null,
                    "network_context_id": null,
                    "subnet": "10.99.98.128/27",
                    "gateway": "10.99.98.129",
                    "broadcast_address": "10.99.98.159",
                    "domain_name": "mcd.restricted",
                    "dns_servers": [
                        "142.11.161.30",
                        "142.11.161.32"
                    ],
                    "default_lease_time": 43200,
                    "max_lease_time": 86400,
                    "ip_ranges": [
                        {
                            "start_ip": "10.99.98.130",
                            "end_ip": "10.99.98.156"
                        }
                    ],
                    "static_mappings": null,
                    "custom_options": null,
                    "address_family": "ipv4",
                    "vrf_context_id": "Global"
                },
                {
                    "disabled": false,
                    "tags": null,
                    "description": null,
                    "network_context_id": null,
                    "subnet": "10.99.98.160/27",
                    "gateway": "10.99.98.161",
                    "broadcast_address": "10.99.98.191",
                    "domain_name": "management.mc.local",
                    "dns_servers": [
                        "8.8.8.8",
                        "4.2.2.2"
                    ],
                    "default_lease_time": 43200,
                    "max_lease_time": 86400,
                    "ip_ranges": [
                        {
                            "start_ip": "10.99.98.182",
                            "end_ip": "10.99.98.188"
                        }
                    ],
                    "static_mappings": null,
                    "custom_options": null,
                    "address_family": "ipv4",
                    "vrf_context_id": "Global"
                },
                {
                    "disabled": false,
                    "tags": null,
                    "description": null,
                    "network_context_id": null,
                    "subnet": "10.99.98.224/27",
                    "gateway": "10.99.98.225",
                    "broadcast_address": "10.99.98.255",
                    "domain_name": "automation.mcd.local",
                    "dns_servers": [
                        "8.8.8.8",
                        "1.1.1.1"
                    ],
                    "default_lease_time": 43200,
                    "max_lease_time": 86400,
                    "ip_ranges": [
                        {
                            "start_ip": "10.99.98.247",
                            "end_ip": "10.99.98.252"
                        }
                    ],
                    "static_mappings": null,
                    "custom_options": null,
                    "address_family": "ipv4",
                    "vrf_context_id": "Global"
                },
                {
                    "disabled": false,
                    "tags": null,
                    "description": null,
                    "network_context_id": null,
                    "subnet": "192.168.1.0/24",
                    "gateway": "192.168.1.1",
                    "broadcast_address": "192.168.1.255",
                    "domain_name": "ztp.local",
                    "dns_servers": [
                        "8.8.8.8",
                        "1.1.1.1"
                    ],
                    "default_lease_time": 1200,
                    "max_lease_time": 86400,
                    "ip_ranges": [
                        {
                            "start_ip": "192.168.1.3",
                            "end_ip": "192.168.1.50"
                        }
                    ],
                    "static_mappings": null,
                    "custom_options": null,
                    "address_family": "ipv4",
                    "vrf_context_id": "Global"
                },
                {
                    "disabled": false,
                    "tags": null,
                    "description": null,
                    "network_context_id": null,
                    "subnet": "192.168.148.0/22",
                    "gateway": "192.168.151.254",
                    "broadcast_address": "192.168.151.255",
                    "domain_name": "NA",
                    "dns_servers": [
                        "1.1.1.1",
                        "8.8.8.8"
                    ],
                    "default_lease_time": 43200,
                    "max_lease_time": 86400,
                    "ip_ranges": [
                        {
                            "start_ip": "192.168.148.1",
                            "end_ip": "192.168.148.254"
                        }
                    ],
                    "static_mappings": null,
                    "custom_options": null,
                    "address_family": "ipv4",
                    "vrf_context_id": "Global"
                },
                {
                    "disabled": false,
                    "tags": null,
                    "description": null,
                    "network_context_id": null,
                    "subnet": "192.168.51.0/24",
                    "gateway": "192.168.51.254",
                    "broadcast_address": "192.168.51.255",
                    "domain_name": "crew.mcd.local",
                    "dns_servers": [
                        "8.8.8.8",
                        "4.2.2.2"
                    ],
                    "default_lease_time": 43200,
                    "max_lease_time": 86400,
                    "ip_ranges": [
                        {
                            "start_ip": "192.168.51.10",
                            "end_ip": "192.168.51.99"
                        }
                    ],
                    "static_mappings": null,
                    "custom_options": null,
                    "address_family": "ipv4",
                    "vrf_context_id": "Global"
                },
                {
                    "disabled": false,
                    "tags": null,
                    "description": null,
                    "network_context_id": null,
                    "subnet": "192.168.90.0/24",
                    "gateway": "192.168.90.254",
                    "broadcast_address": "192.168.90.255",
                    "domain_name": "untrusted.mcd.local",
                    "dns_servers": [
                        "8.8.8.8",
                        "4.2.2.2"
                    ],
                    "default_lease_time": 43200,
                    "max_lease_time": 86400,
                    "ip_ranges": [
                        {
                            "start_ip": "192.168.90.10",
                            "end_ip": "192.168.90.99"
                        }
                    ],
                    "static_mappings": null,
                    "custom_options": null,
                    "address_family": "ipv4",
                    "vrf_context_id": "Global"
                },
                {
                    "disabled": false,
                    "tags": null,
                    "description": null,
                    "network_context_id": null,
                    "subnet": "192.168.91.0/24",
                    "gateway": "192.168.91.254",
                    "broadcast_address": "192.168.91.255",
                    "domain_name": "private.mcd.local",
                    "dns_servers": [
                        "8.8.8.8",
                        "4.2.2.2"
                    ],
                    "default_lease_time": 43200,
                    "max_lease_time": 86400,
                    "ip_ranges": [
                        {
                            "start_ip": "192.168.91.10",
                            "end_ip": "192.168.91.99"
                        }
                    ],
                    "static_mappings": null,
                    "custom_options": null,
                    "address_family": "ipv4",
                    "vrf_context_id": "Global"
                },
                {
                    "disabled": false,
                    "tags": null,
                    "description": null,
                    "network_context_id": null,
                    "subnet": "192.168.92.0/23",
                    "gateway": "192.168.93.254",
                    "broadcast_address": "192.168.93.255",
                    "domain_name": "iotwired.mcd.local",
                    "dns_servers": [
                        "8.8.8.8",
                        "4.2.2.2"
                    ],
                    "default_lease_time": 43200,
                    "max_lease_time": 86400,
                    "ip_ranges": [
                        {
                            "start_ip": "192.168.92.10",
                            "end_ip": "192.168.93.99"
                        }
                    ],
                    "static_mappings": null,
                    "custom_options": null,
                    "address_family": "ipv4",
                    "vrf_context_id": "Global"
                },
                {
                    "disabled": false,
                    "tags": null,
                    "description": null,
                    "network_context_id": null,
                    "subnet": "192.168.94.0/23",
                    "gateway": "192.168.95.254",
                    "broadcast_address": "192.168.95.255",
                    "domain_name": "iotwireless.mcd.local",
                    "dns_servers": [
                        "8.8.8.8",
                        "4.2.2.2"
                    ],
                    "default_lease_time": 43200,
                    "max_lease_time": 86400,
                    "ip_ranges": [
                        {
                            "start_ip": "192.168.94.10",
                            "end_ip": "192.168.94.99"
                        }
                    ],
                    "static_mappings": null,
                    "custom_options": null,
                    "address_family": "ipv4",
                    "vrf_context_id": "Global"
                }
            ],
            "deviceidconfigs v2.1": {
                "cfg_device_id_enabled": true
            },
            "elements v3.1": {
                "acn-3200-primary": {
                    "tenant_id": "1341583240",
                    "software_version": "6.3.1-b8",
                    "serial_number": "027301-005973-3946",
                    "model_name": "ion 3200",
                    "description": null,
                    "role": "SPOKE",
                    "state": "bound",
                    "allowed_roles": [
                        "HUB",
                        "SPOKE"
                    ],
                    "cluster_id": null,
                    "l3_direct_private_wan_forwarding": true,
                    "l3_lan_forwarding": true,
                    "connected": false,
                    "admin_action": null,
                    "deployment_op": null,
                    "network_policysetstack_id": null,
                    "priority_policysetstack_id": null,
                    "tags": null,
                    "nat_policysetstack_id": null,
                    "vpn_to_vpn_forwarding": false,
                    "admin_renew_state": null,
                    "spoke_ha_config": {
                        "cluster_id": "HA-Branch",
                        "enable": true,
                        "priority": 200,
                        "source_interface": "HA",
                        "track": null
                    },
                    "admin_suspend_state": "active_suspend_init",
                    "fips_mode": "non_fips",
                    "fips_mode_change_start_time": 0,
                    "main_power_usage_threshold": 100,
                    "device_profile_id": null,
                    "switch_config": {
                        "mstp_enabled": false,
                        "default_vlan_id": 1,
                        "stp_mode": "rstp",
                        "stp_max_age": 20,
                        "stp_aging_timer": 300,
                        "stp_hello_time": 2,
                        "stp_forward_delay": 15,
                        "stp_priority": 24576
                    },
                    "override_indicator": null,
                    "led_config": {
                        "service_led_on": false
                    },
                    "device_change_mode_state": "element_change_mode_init",
                    "device_mode": "l2-mode",
                    "device_change_mode_start_time": 1718926319873,
                    "cellular_modules_sim_security v2.0": {},
                    "interfaces v4.17": {
                        "1": {
                            "description": "",
                            "type": "port",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": {
                                "type": "dhcp",
                                "static_config": null,
                                "dhcp_config": null,
                                "dns_v4_config": null,
                                "routes": null
                            },
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "public",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": null,
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": null,
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "2": {
                            "description": "",
                            "type": "port",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": [
                                "Backup5GWithVerizon"
                            ],
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": {
                                "type": "dhcp",
                                "static_config": null,
                                "dhcp_config": null,
                                "dns_v4_config": null,
                                "routes": null
                            },
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "public",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": "internet",
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": null,
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "5": {
                            "description": "",
                            "type": "switch_port",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": null,
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "switch-access",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": {
                                "vlan_mode": "trunk",
                                "voice_vlan_id": null,
                                "native_vlan_id": 10,
                                "access_vlan_id": null,
                                "trunk_vlans": [
                                    "410",
                                    "460",
                                    "451",
                                    "492",
                                    "494",
                                    "430",
                                    "491",
                                    "450",
                                    "420",
                                    "490"
                                ],
                                "stp_port_enabled": true,
                                "stp_port_priority": 128,
                                "stp_port_cost": 4,
                                "bpdu_guard_enabled": false,
                                "root_guard_enabled": false,
                                "forward_fast_enabled": false,
                                "storm_control_config": {
                                    "unicast_threshold": null,
                                    "multicast_threshold": null,
                                    "broadcast_threshold": 1000
                                }
                            },
                            "interface_profile_id": null,
                            "vlan_config": null,
                            "authentication_config": {
                                "mode": "none",
                                "reauthentication_timeout": 1800,
                                "fallback_retry_count": 0
                            },
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "6": {
                            "description": "",
                            "type": "switch_port",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": null,
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "switch-access",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": {
                                "vlan_mode": "trunk",
                                "voice_vlan_id": null,
                                "native_vlan_id": 1,
                                "access_vlan_id": null,
                                "trunk_vlans": [
                                    "410",
                                    "460",
                                    "451",
                                    "492",
                                    "494",
                                    "430",
                                    "491",
                                    "450",
                                    "420",
                                    "490"
                                ],
                                "stp_port_enabled": true,
                                "stp_port_priority": 128,
                                "stp_port_cost": 4,
                                "bpdu_guard_enabled": false,
                                "root_guard_enabled": false,
                                "forward_fast_enabled": false,
                                "storm_control_config": {
                                    "unicast_threshold": null,
                                    "multicast_threshold": null,
                                    "broadcast_threshold": 1000
                                }
                            },
                            "interface_profile_id": null,
                            "vlan_config": null,
                            "authentication_config": {
                                "mode": "none",
                                "reauthentication_timeout": 1800,
                                "fallback_retry_count": 0
                            },
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "7": {
                            "description": "",
                            "type": "switch_port",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": null,
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "switch-access",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": true,
                            "power_usage_threshold": 100,
                            "lldp_enabled": true,
                            "switch_port_config": {
                                "vlan_mode": "trunk",
                                "voice_vlan_id": null,
                                "native_vlan_id": 1,
                                "access_vlan_id": null,
                                "trunk_vlans": [
                                    "410",
                                    "460",
                                    "451",
                                    "492",
                                    "494",
                                    "430",
                                    "491",
                                    "450",
                                    "420",
                                    "490"
                                ],
                                "stp_port_enabled": true,
                                "stp_port_priority": 128,
                                "stp_port_cost": 4,
                                "bpdu_guard_enabled": false,
                                "root_guard_enabled": false,
                                "forward_fast_enabled": false,
                                "storm_control_config": {
                                    "unicast_threshold": null,
                                    "multicast_threshold": null,
                                    "broadcast_threshold": 1000
                                }
                            },
                            "interface_profile_id": null,
                            "vlan_config": null,
                            "authentication_config": {
                                "mode": "none",
                                "reauthentication_timeout": 1800,
                                "fallback_retry_count": 0
                            },
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "8": {
                            "description": "",
                            "type": "switch_port",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": null,
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "switch-access",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": true,
                            "power_usage_threshold": 100,
                            "lldp_enabled": true,
                            "switch_port_config": {
                                "vlan_mode": "access",
                                "voice_vlan_id": null,
                                "native_vlan_id": null,
                                "access_vlan_id": 4000,
                                "trunk_vlans": null,
                                "stp_port_enabled": true,
                                "stp_port_priority": 128,
                                "stp_port_cost": 4,
                                "bpdu_guard_enabled": false,
                                "root_guard_enabled": false,
                                "forward_fast_enabled": true,
                                "storm_control_config": {
                                    "unicast_threshold": null,
                                    "multicast_threshold": null,
                                    "broadcast_threshold": 1000
                                }
                            },
                            "interface_profile_id": null,
                            "vlan_config": null,
                            "authentication_config": {
                                "mode": "none",
                                "reauthentication_timeout": 1800,
                                "fallback_retry_count": 0
                            },
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "9": {
                            "description": "",
                            "type": "switch_port",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": null,
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "switch-access",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": true,
                            "power_usage_threshold": 100,
                            "lldp_enabled": true,
                            "switch_port_config": {
                                "vlan_mode": "access",
                                "voice_vlan_id": null,
                                "native_vlan_id": null,
                                "access_vlan_id": 4000,
                                "trunk_vlans": null,
                                "stp_port_enabled": true,
                                "stp_port_priority": 128,
                                "stp_port_cost": 4,
                                "bpdu_guard_enabled": false,
                                "root_guard_enabled": false,
                                "forward_fast_enabled": true,
                                "storm_control_config": {
                                    "unicast_threshold": null,
                                    "multicast_threshold": null,
                                    "broadcast_threshold": 1000
                                }
                            },
                            "interface_profile_id": null,
                            "vlan_config": null,
                            "authentication_config": {
                                "mode": "none",
                                "reauthentication_timeout": 1800,
                                "fallback_retry_count": 0
                            },
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "10": {
                            "description": "",
                            "type": "switch_port",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": null,
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "switch-access",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": true,
                            "power_usage_threshold": 100,
                            "lldp_enabled": true,
                            "switch_port_config": {
                                "vlan_mode": "access",
                                "voice_vlan_id": null,
                                "native_vlan_id": null,
                                "access_vlan_id": 4000,
                                "trunk_vlans": null,
                                "stp_port_enabled": true,
                                "stp_port_priority": 128,
                                "stp_port_cost": 4,
                                "bpdu_guard_enabled": false,
                                "root_guard_enabled": false,
                                "forward_fast_enabled": true,
                                "storm_control_config": {
                                    "unicast_threshold": null,
                                    "multicast_threshold": null,
                                    "broadcast_threshold": 1000
                                }
                            },
                            "interface_profile_id": null,
                            "vlan_config": null,
                            "authentication_config": {
                                "mode": "none",
                                "reauthentication_timeout": 1800,
                                "fallback_retry_count": 0
                            },
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "34": {
                            "description": null,
                            "type": "bypasspair",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": [
                                "PrimaryCircuitWithATT"
                            ],
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": {
                                "type": "dhcp",
                                "static_config": null,
                                "dhcp_config": null,
                                "dns_v4_config": null,
                                "routes": null
                            },
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "public",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": {
                                "lan": "4",
                                "wan": "3",
                                "use_relay": true,
                                "lan_state_propagation": false
                            },
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": "internet",
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": null,
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "vlan1": {
                            "description": "",
                            "type": "vlan",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": {
                                "type": "static",
                                "static_config": {
                                    "address": "192.168.1.1/24"
                                },
                                "dhcp_config": null,
                                "dns_v4_config": {
                                    "name_servers": [
                                        "8.8.8.8",
                                        "1.1.1.1"
                                    ]
                                },
                                "routes": null
                            },
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "lan",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": "SSE Bypass",
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": {
                                "voice_enabled": false,
                                "vlan_id": 1,
                                "mstp_instance": 0
                            },
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "AUTOMATION": {
                            "description": null,
                            "type": "vlan",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": {
                                "type": "static",
                                "static_config": {
                                    "address": "10.99.98.225/27"
                                },
                                "dhcp_config": null,
                                "dns_v4_config": {
                                    "name_servers": [
                                        "8.8.8.8",
                                        "1.1.1.1"
                                    ]
                                },
                                "routes": null
                            },
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "lan",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "global",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": {
                                "voice_enabled": false,
                                "vlan_id": 460,
                                "mstp_instance": 0
                            },
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "CORE": {
                            "description": null,
                            "type": "vlan",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": {
                                "type": "static",
                                "static_config": {
                                    "address": "10.99.98.62/25"
                                },
                                "dhcp_config": null,
                                "dns_v4_config": {
                                    "name_servers": [
                                        "8.8.8.8",
                                        "1.1.1.1"
                                    ]
                                },
                                "routes": null
                            },
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "lan",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "global",
                            "tags": null,
                            "nat_zone_id": "internet",
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": {
                                "voice_enabled": false,
                                "vlan_id": 410,
                                "mstp_instance": 0
                            },
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "CREW": {
                            "description": null,
                            "type": "vlan",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": {
                                "type": "static",
                                "static_config": {
                                    "address": "192.168.51.254/24"
                                },
                                "dhcp_config": null,
                                "dns_v4_config": {
                                    "name_servers": [
                                        "8.8.8.8",
                                        "1.1.1.1"
                                    ]
                                },
                                "routes": null
                            },
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "lan",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": {
                                "voice_enabled": false,
                                "vlan_id": 451,
                                "mstp_instance": 0
                            },
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "Cradlepoint": {
                            "description": null,
                            "type": "vlan",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": null,
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "none",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": {
                                "voice_enabled": false,
                                "vlan_id": 4000,
                                "mstp_instance": 0
                            },
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "HA": {
                            "description": null,
                            "type": "vlan",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": {
                                "type": "static",
                                "static_config": {
                                    "address": "100.1.10.1/24"
                                },
                                "dhcp_config": null,
                                "dns_v4_config": {
                                    "name_servers": [
                                        "8.8.8.8",
                                        "1.1.1.1"
                                    ]
                                },
                                "routes": [
                                    {
                                        "via": "100.1.10.2",
                                        "destination": "0.0.0.0/0"
                                    }
                                ]
                            },
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "ha",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": {
                                "voice_enabled": false,
                                "vlan_id": 10,
                                "mstp_instance": 0
                            },
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "IOT_WIRED": {
                            "description": null,
                            "type": "vlan",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": {
                                "type": "static",
                                "static_config": {
                                    "address": "192.168.93.254/23"
                                },
                                "dhcp_config": null,
                                "dns_v4_config": {
                                    "name_servers": [
                                        "8.8.8.8",
                                        "1.1.1.1"
                                    ]
                                },
                                "routes": null
                            },
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "lan",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": {
                                "voice_enabled": false,
                                "vlan_id": 492,
                                "mstp_instance": 0
                            },
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "IOT_WIRELESS": {
                            "description": null,
                            "type": "vlan",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": {
                                "type": "static",
                                "static_config": {
                                    "address": "192.168.95.254/23"
                                },
                                "dhcp_config": null,
                                "dns_v4_config": {
                                    "name_servers": [
                                        "8.8.8.8",
                                        "1.1.1.1"
                                    ]
                                },
                                "routes": null
                            },
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "lan",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": {
                                "voice_enabled": false,
                                "vlan_id": 494,
                                "mstp_instance": 0
                            },
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "MANAGEMENT": {
                            "description": null,
                            "type": "vlan",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": {
                                "type": "static",
                                "static_config": {
                                    "address": "10.99.98.190/27"
                                },
                                "dhcp_config": null,
                                "dns_v4_config": {
                                    "name_servers": [
                                        "8.8.8.8",
                                        "1.1.1.1"
                                    ]
                                },
                                "routes": null
                            },
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "lan",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "global",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": {
                                "voice_enabled": false,
                                "vlan_id": 430,
                                "mstp_instance": 0
                            },
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "PRIVATE": {
                            "description": null,
                            "type": "vlan",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": {
                                "type": "static",
                                "static_config": {
                                    "address": "192.168.91.254/24"
                                },
                                "dhcp_config": null,
                                "dns_v4_config": {
                                    "name_servers": [
                                        "8.8.8.8",
                                        "1.1.1.1"
                                    ]
                                },
                                "routes": null
                            },
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "lan",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": {
                                "voice_enabled": false,
                                "vlan_id": 491,
                                "mstp_instance": 0
                            },
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "PUBLIC": {
                            "description": null,
                            "type": "vlan",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": {
                                "type": "static",
                                "static_config": {
                                    "address": "192.168.151.254/22"
                                },
                                "dhcp_config": null,
                                "dns_v4_config": {
                                    "name_servers": [
                                        "8.8.8.8",
                                        "1.1.1.1"
                                    ]
                                },
                                "routes": null
                            },
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "lan",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": {
                                "voice_enabled": false,
                                "vlan_id": 450,
                                "mstp_instance": 0
                            },
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "RESTRICTED": {
                            "description": null,
                            "type": "vlan",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": {
                                "type": "static",
                                "static_config": {
                                    "address": "10.99.98.158/27"
                                },
                                "dhcp_config": null,
                                "dns_v4_config": {
                                    "name_servers": [
                                        "8.8.8.8",
                                        "1.1.1.1"
                                    ]
                                },
                                "routes": null
                            },
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "lan",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "global",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": {
                                "voice_enabled": false,
                                "vlan_id": 420,
                                "mstp_instance": 0
                            },
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "UNTRUSTED": {
                            "description": null,
                            "type": "vlan",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": {
                                "type": "static",
                                "static_config": {
                                    "address": "192.168.90.254/24"
                                },
                                "dhcp_config": null,
                                "dns_v4_config": {
                                    "name_servers": [
                                        "8.8.8.8",
                                        "1.1.1.1"
                                    ]
                                },
                                "routes": null
                            },
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "lan",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": {
                                "voice_enabled": false,
                                "vlan_id": 490,
                                "mstp_instance": 0
                            },
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        }
                    },
                    "routing": {
                        "static v2.3": {
                            "Static Route 2": {
                                "description": null,
                                "tags": null,
                                "destination_prefix": "10.64.99.1/32",
                                "nexthops": [
                                    {
                                        "nexthop_ip": null,
                                        "nexthop_interface_id": "UNTRUSTED",
                                        "admin_distance": 1,
                                        "self": false
                                    }
                                ],
                                "scope": "global",
                                "network_context_id": null,
                                "nexthop_reachability_probe": false,
                                "address_family": "ipv4",
                                "vrf_context_id": "Global"
                            },
                            "Static Route 1": {
                                "description": null,
                                "tags": null,
                                "destination_prefix": "10.99.98.0/24",
                                "nexthops": [
                                    {
                                        "nexthop_ip": null,
                                        "nexthop_interface_id": "vlan1",
                                        "admin_distance": 1,
                                        "self": false
                                    }
                                ],
                                "scope": "global",
                                "network_context_id": null,
                                "nexthop_reachability_probe": false,
                                "address_family": "ipv4",
                                "vrf_context_id": "Global"
                            }
                        },
                        "bgp": {
                            "global_config v2.3": {
                                "router_id": null,
                                "local_as_num": "65533",
                                "keepalive_time": 30,
                                "hold_time": 90,
                                "adv_interval": 1,
                                "peer_retry_time": 120,
                                "md5_secret": null,
                                "multi_hop_limit": 1,
                                "maximum_paths": 1,
                                "admin_distance": 20,
                                "graceful_restart": false,
                                "stalepath_time": 120,
                                "prefix_adv_type": "unaggregated",
                                "prefixes_to_adv_to_wan": null,
                                "prefix_adv_type_to_lan": "default",
                                "peer_auth_type": "none",
                                "ipv6_prefixes_to_adv_to_wan": null
                            }
                        },
                        "route_maps v2.2": {
                            "my-test_default-map": {
                                "description": null,
                                "tags": null,
                                "route_map_entries": [
                                    {
                                        "order": 10,
                                        "permit": true,
                                        "match": {
                                            "as_path_id": null,
                                            "ip_prefix_list_id": "my-test_default",
                                            "ip_next_hop_id": null,
                                            "community_list_id": null,
                                            "tag": 0
                                        },
                                        "set": {
                                            "as_path_prepend": null,
                                            "local_preference": 0,
                                            "weight": 0,
                                            "community": null,
                                            "ip_next_hop": null,
                                            "ip_v6_next_hop": null,
                                            "tag": 0,
                                            "additive_community": false
                                        },
                                        "continue_entry": null
                                    },
                                    {
                                        "order": 20,
                                        "permit": false,
                                        "match": {
                                            "as_path_id": null,
                                            "ip_prefix_list_id": null,
                                            "ip_next_hop_id": null,
                                            "community_list_id": null,
                                            "tag": 0
                                        },
                                        "set": {
                                            "as_path_prepend": null,
                                            "local_preference": 0,
                                            "weight": 0,
                                            "community": null,
                                            "ip_next_hop": null,
                                            "ip_v6_next_hop": null,
                                            "tag": 0,
                                            "additive_community": false
                                        },
                                        "continue_entry": null
                                    }
                                ],
                                "auto_generated": false
                            }
                        },
                        "prefix_lists v2.1": {
                            "my-test_default": {
                                "description": null,
                                "tags": null,
                                "prefix_filter_list": [
                                    {
                                        "order": 10,
                                        "permit": true,
                                        "prefix": "10.99.98.0/24",
                                        "ipv6_prefix": null,
                                        "ge": 0,
                                        "le": 0
                                    },
                                    {
                                        "order": 20,
                                        "permit": true,
                                        "prefix": "10.64.6.0/24",
                                        "ipv6_prefix": null,
                                        "ge": 32,
                                        "le": 0
                                    },
                                    {
                                        "order": 30,
                                        "permit": true,
                                        "prefix": "100.64.6.0/24",
                                        "ipv6_prefix": null,
                                        "ge": 32,
                                        "le": 0
                                    }
                                ],
                                "auto_generated": false
                            }
                        }
                    },
                    "multicastglobalconfigs v2.1": [
                        {
                            "spt_switchover_enabled": true,
                            "bsm_enabled": false,
                            "dr_priority": 1,
                            "pim_protocol_parameters": {
                                "hello_interval": 30,
                                "hello_hold_time": 105,
                                "join_prune_interval": 60
                            },
                            "igmp_protocol_parameters": {
                                "query_interval": 125,
                                "last_member_query_count": 2,
                                "last_member_query_interval": 10,
                                "query_max_response_time": 100
                            }
                        }
                    ],
                    "ntp v2.0": [
                        {
                            "name": "default",
                            "description": "Default NTP template created by super user.",
                            "tags": null,
                            "ntp_servers": [
                                {
                                    "host": "0.cloudgenix.pool.ntp.org",
                                    "version": 4,
                                    "min_poll": 9,
                                    "max_poll": 10
                                },
                                {
                                    "host": "1.cloudgenix.pool.ntp.org",
                                    "version": 4,
                                    "min_poll": 9,
                                    "max_poll": 10
                                },
                                {
                                    "host": "2.cloudgenix.pool.ntp.org",
                                    "version": 4,
                                    "min_poll": 9,
                                    "max_poll": 10
                                },
                                {
                                    "host": "3.cloudgenix.pool.ntp.org",
                                    "version": 4,
                                    "min_poll": 9,
                                    "max_poll": 10
                                },
                                {
                                    "host": "time.nist.gov",
                                    "version": 4,
                                    "min_poll": 13,
                                    "max_poll": 15
                                }
                            ],
                            "source_interface_ids": null
                        }
                    ],
                    "element_security_zones v2.0": [
                        {
                            "zone_id": "HA",
                            "lannetwork_ids": null,
                            "interface_ids": [
                                "HA"
                            ],
                            "wanoverlay_ids": null,
                            "waninterface_ids": null
                        },
                        {
                            "zone_id": "CORE",
                            "lannetwork_ids": null,
                            "interface_ids": [
                                "CORE"
                            ],
                            "wanoverlay_ids": null,
                            "waninterface_ids": null
                        },
                        {
                            "zone_id": "AUTOMATION",
                            "lannetwork_ids": null,
                            "interface_ids": [
                                "AUTOMATION"
                            ],
                            "wanoverlay_ids": null,
                            "waninterface_ids": null
                        },
                        {
                            "zone_id": "CREW",
                            "lannetwork_ids": null,
                            "interface_ids": [
                                "CREW"
                            ],
                            "wanoverlay_ids": null,
                            "waninterface_ids": null
                        },
                        {
                            "zone_id": "IOT_WIRED",
                            "lannetwork_ids": null,
                            "interface_ids": [
                                "IOT_WIRED"
                            ],
                            "wanoverlay_ids": null,
                            "waninterface_ids": null
                        },
                        {
                            "zone_id": "IOT_WIRELESS",
                            "lannetwork_ids": null,
                            "interface_ids": [
                                "IOT_WIRELESS"
                            ],
                            "wanoverlay_ids": null,
                            "waninterface_ids": null
                        },
                        {
                            "zone_id": "MANAGEMENT",
                            "lannetwork_ids": null,
                            "interface_ids": [
                                "MANAGEMENT"
                            ],
                            "wanoverlay_ids": null,
                            "waninterface_ids": null
                        },
                        {
                            "zone_id": "PRIVATE",
                            "lannetwork_ids": null,
                            "interface_ids": [
                                "PRIVATE"
                            ],
                            "wanoverlay_ids": null,
                            "waninterface_ids": null
                        },
                        {
                            "zone_id": "PUBLIC",
                            "lannetwork_ids": null,
                            "interface_ids": [
                                "PUBLIC"
                            ],
                            "wanoverlay_ids": null,
                            "waninterface_ids": null
                        },
                        {
                            "zone_id": "RESTRICTED",
                            "lannetwork_ids": null,
                            "interface_ids": [
                                "RESTRICTED"
                            ],
                            "wanoverlay_ids": null,
                            "waninterface_ids": null
                        },
                        {
                            "zone_id": "UNTRUSTED",
                            "lannetwork_ids": null,
                            "interface_ids": [
                                "UNTRUSTED"
                            ],
                            "wanoverlay_ids": null,
                            "waninterface_ids": null
                        },
                        {
                            "zone_id": "NATIVE",
                            "lannetwork_ids": null,
                            "interface_ids": [
                                "vlan1"
                            ],
                            "wanoverlay_ids": null,
                            "waninterface_ids": null
                        },
                        {
                            "zone_id": "INTERNET",
                            "lannetwork_ids": null,
                            "interface_ids": null,
                            "wanoverlay_ids": null,
                            "waninterface_ids": [
                                "Backup5GWithVerizon",
                                "PrimaryCircuitWithATT"
                            ]
                        },
                        {
                            "zone_id": "SSE",
                            "lannetwork_ids": null,
                            "interface_ids": null,
                            "wanoverlay_ids": null,
                            "waninterface_ids": null
                        }
                    ],
                    "application_probe v2.0": {
                        "name": "default-probe-configuration-1712188018604015796",
                        "description": null,
                        "tags": null,
                        "enable_probe": true,
                        "source_interface_id": null
                    },
                    "toolkit v2.2": {
                        "ssh_enabled": true,
                        "inactive_interval": 15,
                        "retry_login_count": 5,
                        "account_disable_interval": 5,
                        "otpkey_version": 1,
                        "ssh_outbound_enabled": true
                    }
                },
                "acn-3200-secondary": {
                    "tenant_id": "1341583240",
                    "software_version": "6.3.1-b8",
                    "serial_number": "027301-005967-8597",
                    "model_name": "ion 3200",
                    "description": null,
                    "role": "SPOKE",
                    "state": "bound",
                    "allowed_roles": [
                        "HUB",
                        "SPOKE"
                    ],
                    "cluster_id": null,
                    "l3_direct_private_wan_forwarding": true,
                    "l3_lan_forwarding": true,
                    "connected": false,
                    "admin_action": null,
                    "deployment_op": null,
                    "network_policysetstack_id": null,
                    "priority_policysetstack_id": null,
                    "tags": null,
                    "nat_policysetstack_id": null,
                    "vpn_to_vpn_forwarding": false,
                    "admin_renew_state": null,
                    "spoke_ha_config": {
                        "cluster_id": "HA-Branch",
                        "enable": true,
                        "priority": 100,
                        "source_interface": "HA",
                        "track": null
                    },
                    "admin_suspend_state": "active_suspend_init",
                    "fips_mode": "non_fips",
                    "fips_mode_change_start_time": 0,
                    "main_power_usage_threshold": 100,
                    "device_profile_id": null,
                    "switch_config": {
                        "mstp_enabled": false,
                        "default_vlan_id": 1,
                        "stp_mode": "rstp",
                        "stp_max_age": 20,
                        "stp_aging_timer": 300,
                        "stp_hello_time": 2,
                        "stp_forward_delay": 15,
                        "stp_priority": 28672
                    },
                    "override_indicator": null,
                    "led_config": {
                        "service_led_on": false
                    },
                    "device_change_mode_state": "element_change_mode_init",
                    "device_mode": "l2-mode",
                    "device_change_mode_start_time": 1718927615192,
                    "cellular_modules_sim_security v2.0": {},
                    "interfaces v4.17": {
                        "1": {
                            "description": "",
                            "type": "port",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": {
                                "type": "dhcp",
                                "static_config": null,
                                "dhcp_config": null,
                                "dns_v4_config": null,
                                "routes": null
                            },
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "public",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": null,
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": null,
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "2": {
                            "description": "",
                            "type": "port",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": [
                                "PrimaryCircuitWithATT"
                            ],
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": {
                                "type": "dhcp",
                                "static_config": null,
                                "dhcp_config": null,
                                "dns_v4_config": null,
                                "routes": null
                            },
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "public",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": "internet",
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": null,
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "5": {
                            "description": "",
                            "type": "switch_port",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": null,
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "switch-access",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": {
                                "vlan_mode": "trunk",
                                "voice_vlan_id": null,
                                "native_vlan_id": 10,
                                "access_vlan_id": null,
                                "trunk_vlans": [
                                    "410",
                                    "460",
                                    "451",
                                    "492",
                                    "494",
                                    "430",
                                    "491",
                                    "450",
                                    "420",
                                    "490"
                                ],
                                "stp_port_enabled": true,
                                "stp_port_priority": 128,
                                "stp_port_cost": 4,
                                "bpdu_guard_enabled": false,
                                "root_guard_enabled": false,
                                "forward_fast_enabled": false,
                                "storm_control_config": {
                                    "unicast_threshold": null,
                                    "multicast_threshold": null,
                                    "broadcast_threshold": 1000
                                }
                            },
                            "interface_profile_id": null,
                            "vlan_config": null,
                            "authentication_config": {
                                "mode": "none",
                                "reauthentication_timeout": 1800,
                                "fallback_retry_count": 0
                            },
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "6": {
                            "description": "",
                            "type": "switch_port",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": null,
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "switch-access",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": {
                                "vlan_mode": "trunk",
                                "voice_vlan_id": null,
                                "native_vlan_id": 1,
                                "access_vlan_id": null,
                                "trunk_vlans": [
                                    "410",
                                    "460",
                                    "451",
                                    "492",
                                    "494",
                                    "430",
                                    "491",
                                    "450",
                                    "420",
                                    "490"
                                ],
                                "stp_port_enabled": true,
                                "stp_port_priority": 128,
                                "stp_port_cost": 4,
                                "bpdu_guard_enabled": false,
                                "root_guard_enabled": false,
                                "forward_fast_enabled": false,
                                "storm_control_config": {
                                    "unicast_threshold": null,
                                    "multicast_threshold": null,
                                    "broadcast_threshold": 1000
                                }
                            },
                            "interface_profile_id": null,
                            "vlan_config": null,
                            "authentication_config": {
                                "mode": "none",
                                "reauthentication_timeout": 1800,
                                "fallback_retry_count": 0
                            },
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "7": {
                            "description": "",
                            "type": "switch_port",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": null,
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "switch-access",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": true,
                            "power_usage_threshold": 100,
                            "lldp_enabled": true,
                            "switch_port_config": {
                                "vlan_mode": "trunk",
                                "voice_vlan_id": null,
                                "native_vlan_id": 1,
                                "access_vlan_id": null,
                                "trunk_vlans": [
                                    "410",
                                    "460",
                                    "451",
                                    "492",
                                    "494",
                                    "430",
                                    "491",
                                    "450",
                                    "420",
                                    "490"
                                ],
                                "stp_port_enabled": true,
                                "stp_port_priority": 128,
                                "stp_port_cost": 4,
                                "bpdu_guard_enabled": false,
                                "root_guard_enabled": false,
                                "forward_fast_enabled": false,
                                "storm_control_config": {
                                    "unicast_threshold": null,
                                    "multicast_threshold": null,
                                    "broadcast_threshold": 1000
                                }
                            },
                            "interface_profile_id": null,
                            "vlan_config": null,
                            "authentication_config": {
                                "mode": "none",
                                "reauthentication_timeout": 1800,
                                "fallback_retry_count": 0
                            },
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "8": {
                            "description": "",
                            "type": "switch_port",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": null,
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "switch-access",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": null,
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": true,
                            "power_usage_threshold": 100,
                            "lldp_enabled": true,
                            "switch_port_config": {
                                "vlan_mode": "access",
                                "voice_vlan_id": null,
                                "native_vlan_id": null,
                                "access_vlan_id": null,
                                "trunk_vlans": null,
                                "stp_port_enabled": true,
                                "stp_port_priority": 128,
                                "stp_port_cost": 4,
                                "bpdu_guard_enabled": false,
                                "root_guard_enabled": false,
                                "forward_fast_enabled": true,
                                "storm_control_config": {
                                    "unicast_threshold": null,
                                    "multicast_threshold": null,
                                    "broadcast_threshold": 1000
                                }
                            },
                            "interface_profile_id": null,
                            "vlan_config": null,
                            "authentication_config": {
                                "mode": "none",
                                "reauthentication_timeout": 1800,
                                "fallback_retry_count": 0
                            },
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "9": {
                            "description": "",
                            "type": "switch_port",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": null,
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "switch-access",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": null,
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": true,
                            "power_usage_threshold": 100,
                            "lldp_enabled": true,
                            "switch_port_config": {
                                "vlan_mode": "access",
                                "voice_vlan_id": null,
                                "native_vlan_id": null,
                                "access_vlan_id": null,
                                "trunk_vlans": null,
                                "stp_port_enabled": true,
                                "stp_port_priority": 128,
                                "stp_port_cost": 4,
                                "bpdu_guard_enabled": false,
                                "root_guard_enabled": false,
                                "forward_fast_enabled": true,
                                "storm_control_config": {
                                    "unicast_threshold": null,
                                    "multicast_threshold": null,
                                    "broadcast_threshold": 1000
                                }
                            },
                            "interface_profile_id": null,
                            "vlan_config": null,
                            "authentication_config": {
                                "mode": "none",
                                "reauthentication_timeout": 1800,
                                "fallback_retry_count": 0
                            },
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "10": {
                            "description": "",
                            "type": "switch_port",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": null,
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "switch-access",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": true,
                            "power_usage_threshold": 100,
                            "lldp_enabled": true,
                            "switch_port_config": {
                                "vlan_mode": "access",
                                "voice_vlan_id": null,
                                "native_vlan_id": null,
                                "access_vlan_id": 4000,
                                "trunk_vlans": null,
                                "stp_port_enabled": true,
                                "stp_port_priority": 128,
                                "stp_port_cost": 4,
                                "bpdu_guard_enabled": false,
                                "root_guard_enabled": false,
                                "forward_fast_enabled": true,
                                "storm_control_config": {
                                    "unicast_threshold": null,
                                    "multicast_threshold": null,
                                    "broadcast_threshold": 1000
                                }
                            },
                            "interface_profile_id": null,
                            "vlan_config": null,
                            "authentication_config": {
                                "mode": "none",
                                "reauthentication_timeout": 1800,
                                "fallback_retry_count": 0
                            },
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "34": {
                            "description": null,
                            "type": "bypasspair",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": [
                                "Backup5GWithVerizon"
                            ],
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": {
                                "type": "dhcp",
                                "static_config": null,
                                "dhcp_config": null,
                                "dns_v4_config": null,
                                "routes": null
                            },
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "public",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": {
                                "lan": "4",
                                "wan": "3",
                                "use_relay": true,
                                "lan_state_propagation": false
                            },
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": "internet",
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": null,
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "vlan1": {
                            "description": "",
                            "type": "vlan",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": {
                                "type": "static",
                                "static_config": {
                                    "address": "192.168.1.1/24"
                                },
                                "dhcp_config": null,
                                "dns_v4_config": {
                                    "name_servers": [
                                        "8.8.8.8",
                                        "1.1.1.1"
                                    ]
                                },
                                "routes": null
                            },
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "lan",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": "SSE Bypass",
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": {
                                "voice_enabled": false,
                                "vlan_id": 1,
                                "mstp_instance": 0
                            },
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "AUTOMATION": {
                            "description": null,
                            "type": "vlan",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": {
                                "type": "static",
                                "static_config": {
                                    "address": "10.99.98.225/27"
                                },
                                "dhcp_config": null,
                                "dns_v4_config": {
                                    "name_servers": [
                                        "8.8.8.8",
                                        "1.1.1.1"
                                    ]
                                },
                                "routes": null
                            },
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "lan",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "global",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": {
                                "voice_enabled": false,
                                "vlan_id": 460,
                                "mstp_instance": 0
                            },
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "CORE": {
                            "description": null,
                            "type": "vlan",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": {
                                "type": "static",
                                "static_config": {
                                    "address": "10.99.98.62/25"
                                },
                                "dhcp_config": null,
                                "dns_v4_config": {
                                    "name_servers": [
                                        "8.8.8.8",
                                        "1.1.1.1"
                                    ]
                                },
                                "routes": null
                            },
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "lan",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "global",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": {
                                "voice_enabled": false,
                                "vlan_id": 410,
                                "mstp_instance": 0
                            },
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "CREW": {
                            "description": null,
                            "type": "vlan",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": {
                                "type": "static",
                                "static_config": {
                                    "address": "192.168.51.254/24"
                                },
                                "dhcp_config": null,
                                "dns_v4_config": {
                                    "name_servers": [
                                        "8.8.8.8",
                                        "1.1.1.1"
                                    ]
                                },
                                "routes": null
                            },
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "lan",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": {
                                "voice_enabled": false,
                                "vlan_id": 451,
                                "mstp_instance": 0
                            },
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "Cradlepoint": {
                            "description": null,
                            "type": "vlan",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": null,
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "none",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": {
                                "voice_enabled": false,
                                "vlan_id": 4000,
                                "mstp_instance": 0
                            },
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "HA": {
                            "description": null,
                            "type": "vlan",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": {
                                "type": "static",
                                "static_config": {
                                    "address": "100.1.10.2/24"
                                },
                                "dhcp_config": null,
                                "dns_v4_config": {
                                    "name_servers": [
                                        "8.8.8.8",
                                        "1.1.1.1"
                                    ]
                                },
                                "routes": [
                                    {
                                        "via": "100.1.10.1",
                                        "destination": "0.0.0.0/0"
                                    }
                                ]
                            },
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "ha",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": {
                                "voice_enabled": false,
                                "vlan_id": 10,
                                "mstp_instance": 0
                            },
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "IOT_WIRED": {
                            "description": null,
                            "type": "vlan",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": {
                                "type": "static",
                                "static_config": {
                                    "address": "192.168.93.254/23"
                                },
                                "dhcp_config": null,
                                "dns_v4_config": {
                                    "name_servers": [
                                        "8.8.8.8",
                                        "1.1.1.1"
                                    ]
                                },
                                "routes": null
                            },
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "lan",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": {
                                "voice_enabled": false,
                                "vlan_id": 492,
                                "mstp_instance": 0
                            },
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "IOT_WIRELESS": {
                            "description": null,
                            "type": "vlan",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": {
                                "type": "static",
                                "static_config": {
                                    "address": "192.168.95.254/23"
                                },
                                "dhcp_config": null,
                                "dns_v4_config": {
                                    "name_servers": [
                                        "8.8.8.8",
                                        "1.1.1.1"
                                    ]
                                },
                                "routes": null
                            },
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "lan",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": {
                                "voice_enabled": false,
                                "vlan_id": 494,
                                "mstp_instance": 0
                            },
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "MANAGEMENT": {
                            "description": null,
                            "type": "vlan",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": {
                                "type": "static",
                                "static_config": {
                                    "address": "10.99.98.190/27"
                                },
                                "dhcp_config": null,
                                "dns_v4_config": {
                                    "name_servers": [
                                        "8.8.8.8",
                                        "1.1.1.1"
                                    ]
                                },
                                "routes": null
                            },
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "lan",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "global",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": {
                                "voice_enabled": false,
                                "vlan_id": 430,
                                "mstp_instance": 0
                            },
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "PRIVATE": {
                            "description": null,
                            "type": "vlan",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": {
                                "type": "static",
                                "static_config": {
                                    "address": "192.168.91.254/24"
                                },
                                "dhcp_config": null,
                                "dns_v4_config": {
                                    "name_servers": [
                                        "8.8.8.8",
                                        "1.1.1.1"
                                    ]
                                },
                                "routes": null
                            },
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "lan",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": {
                                "voice_enabled": false,
                                "vlan_id": 491,
                                "mstp_instance": 0
                            },
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "PUBLIC": {
                            "description": null,
                            "type": "vlan",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": {
                                "type": "static",
                                "static_config": {
                                    "address": "192.168.151.254/22"
                                },
                                "dhcp_config": null,
                                "dns_v4_config": {
                                    "name_servers": [
                                        "8.8.8.8",
                                        "1.1.1.1"
                                    ]
                                },
                                "routes": null
                            },
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "lan",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": {
                                "voice_enabled": false,
                                "vlan_id": 450,
                                "mstp_instance": 0
                            },
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "RESTRICTED": {
                            "description": null,
                            "type": "vlan",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": {
                                "type": "static",
                                "static_config": {
                                    "address": "10.99.98.158/27"
                                },
                                "dhcp_config": null,
                                "dns_v4_config": {
                                    "name_servers": [
                                        "8.8.8.8",
                                        "1.1.1.1"
                                    ]
                                },
                                "routes": null
                            },
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "lan",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "global",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": {
                                "voice_enabled": false,
                                "vlan_id": 420,
                                "mstp_instance": 0
                            },
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        },
                        "UNTRUSTED": {
                            "description": null,
                            "type": "vlan",
                            "attached_lan_networks": null,
                            "site_wan_interface_ids": null,
                            "mac_address": null,
                            "mtu": 1500,
                            "ipv4_config": {
                                "type": "static",
                                "static_config": {
                                    "address": "192.168.90.254/24"
                                },
                                "dhcp_config": null,
                                "dns_v4_config": {
                                    "name_servers": [
                                        "8.8.8.8",
                                        "1.1.1.1"
                                    ]
                                },
                                "routes": null
                            },
                            "dhcp_relay": null,
                            "ethernet_port": {
                                "full_duplex": false,
                                "speed": 0
                            },
                            "admin_up": true,
                            "nat_address": null,
                            "nat_port": 0,
                            "used_for": "lan",
                            "bound_interfaces": null,
                            "sub_interface": null,
                            "pppoe_config": null,
                            "parent": null,
                            "network_context_id": null,
                            "bypass_pair": null,
                            "service_link_config": null,
                            "scope": "local",
                            "tags": null,
                            "nat_zone_id": null,
                            "devicemgmt_policysetstack_id": null,
                            "nat_pools": null,
                            "directed_broadcast": false,
                            "ipfixcollectorcontext_id": null,
                            "ipfixfiltercontext_id": null,
                            "secondary_ip_configs": null,
                            "static_arp_configs": null,
                            "cellular_config": null,
                            "multicast_config": {
                                "multicast_enabled": false,
                                "igmp_version": "IGMPV3",
                                "dr_priority": 1,
                                "igmp_static_joins": null
                            },
                            "ipv6_config": null,
                            "nat_address_v6": null,
                            "nat_port_v6": 0,
                            "poe_enabled": false,
                            "power_usage_threshold": 0,
                            "lldp_enabled": false,
                            "switch_port_config": null,
                            "interface_profile_id": null,
                            "vlan_config": {
                                "voice_enabled": false,
                                "vlan_id": 490,
                                "mstp_instance": 0
                            },
                            "authentication_config": null,
                            "peer_bypasspair_wan_port_type": "none",
                            "vrf_context_id": "Global"
                        }
                    },
                    "routing": {
                        "static v2.3": {
                            "Static Route 1": {
                                "description": null,
                                "tags": null,
                                "destination_prefix": "10.99.98.0/24",
                                "nexthops": [
                                    {
                                        "nexthop_ip": null,
                                        "nexthop_interface_id": "vlan1",
                                        "admin_distance": 1,
                                        "self": false
                                    }
                                ],
                                "scope": "global",
                                "network_context_id": null,
                                "nexthop_reachability_probe": false,
                                "address_family": "ipv4",
                                "vrf_context_id": "Global"
                            }
                        },
                        "bgp": {
                            "global_config v2.3": {
                                "router_id": null,
                                "local_as_num": "65533",
                                "keepalive_time": 30,
                                "hold_time": 90,
                                "adv_interval": 1,
                                "peer_retry_time": 120,
                                "md5_secret": null,
                                "multi_hop_limit": 1,
                                "maximum_paths": 1,
                                "admin_distance": 20,
                                "graceful_restart": false,
                                "stalepath_time": 120,
                                "prefix_adv_type": "unaggregated",
                                "prefixes_to_adv_to_wan": null,
                                "prefix_adv_type_to_lan": "default",
                                "peer_auth_type": "none",
                                "ipv6_prefixes_to_adv_to_wan": null
                            }
                        },
                        "route_maps v2.2": {
                            "my-test_default-map": {
                                "description": null,
                                "tags": null,
                                "route_map_entries": [
                                    {
                                        "order": 10,
                                        "permit": true,
                                        "match": {
                                            "as_path_id": null,
                                            "ip_prefix_list_id": "my-test_default",
                                            "ip_next_hop_id": null,
                                            "community_list_id": null,
                                            "tag": 0
                                        },
                                        "set": {
                                            "as_path_prepend": null,
                                            "local_preference": 0,
                                            "weight": 0,
                                            "community": null,
                                            "ip_next_hop": null,
                                            "ip_v6_next_hop": null,
                                            "tag": 0,
                                            "additive_community": false
                                        },
                                        "continue_entry": null
                                    },
                                    {
                                        "order": 20,
                                        "permit": false,
                                        "match": {
                                            "as_path_id": null,
                                            "ip_prefix_list_id": null,
                                            "ip_next_hop_id": null,
                                            "community_list_id": null,
                                            "tag": 0
                                        },
                                        "set": {
                                            "as_path_prepend": null,
                                            "local_preference": 0,
                                            "weight": 0,
                                            "community": null,
                                            "ip_next_hop": null,
                                            "ip_v6_next_hop": null,
                                            "tag": 0,
                                            "additive_community": false
                                        },
                                        "continue_entry": null
                                    }
                                ],
                                "auto_generated": false
                            }
                        },
                        "prefix_lists v2.1": {
                            "my-test_default": {
                                "description": null,
                                "tags": null,
                                "prefix_filter_list": [
                                    {
                                        "order": 10,
                                        "permit": true,
                                        "prefix": "10.99.98.0/24",
                                        "ipv6_prefix": null,
                                        "ge": 0,
                                        "le": 0
                                    },
                                    {
                                        "order": 20,
                                        "permit": true,
                                        "prefix": "10.64.6.0/24",
                                        "ipv6_prefix": null,
                                        "ge": 32,
                                        "le": 0
                                    },
                                    {
                                        "order": 30,
                                        "permit": true,
                                        "prefix": "100.64.6.0/24",
                                        "ipv6_prefix": null,
                                        "ge": 32,
                                        "le": 0
                                    }
                                ],
                                "auto_generated": false
                            }
                        }
                    },
                    "multicastglobalconfigs v2.1": [
                        {
                            "spt_switchover_enabled": true,
                            "bsm_enabled": false,
                            "dr_priority": 1,
                            "pim_protocol_parameters": {
                                "hello_interval": 30,
                                "hello_hold_time": 105,
                                "join_prune_interval": 60
                            },
                            "igmp_protocol_parameters": {
                                "query_interval": 125,
                                "last_member_query_count": 2,
                                "last_member_query_interval": 10,
                                "query_max_response_time": 100
                            }
                        }
                    ],
                    "ntp v2.0": [
                        {
                            "name": "default",
                            "description": "Default NTP template created by super user.",
                            "tags": null,
                            "ntp_servers": [
                                {
                                    "host": "0.cloudgenix.pool.ntp.org",
                                    "version": 4,
                                    "min_poll": 9,
                                    "max_poll": 10
                                },
                                {
                                    "host": "1.cloudgenix.pool.ntp.org",
                                    "version": 4,
                                    "min_poll": 9,
                                    "max_poll": 10
                                },
                                {
                                    "host": "2.cloudgenix.pool.ntp.org",
                                    "version": 4,
                                    "min_poll": 9,
                                    "max_poll": 10
                                },
                                {
                                    "host": "3.cloudgenix.pool.ntp.org",
                                    "version": 4,
                                    "min_poll": 9,
                                    "max_poll": 10
                                },
                                {
                                    "host": "time.nist.gov",
                                    "version": 4,
                                    "min_poll": 13,
                                    "max_poll": 15
                                }
                            ],
                            "source_interface_ids": null
                        }
                    ],
                    "element_security_zones v2.0": [
                        {
                            "zone_id": "HA",
                            "lannetwork_ids": null,
                            "interface_ids": [
                                "HA"
                            ],
                            "wanoverlay_ids": null,
                            "waninterface_ids": null
                        },
                        {
                            "zone_id": "CORE",
                            "lannetwork_ids": null,
                            "interface_ids": [
                                "CORE"
                            ],
                            "wanoverlay_ids": null,
                            "waninterface_ids": null
                        },
                        {
                            "zone_id": "AUTOMATION",
                            "lannetwork_ids": null,
                            "interface_ids": [
                                "AUTOMATION"
                            ],
                            "wanoverlay_ids": null,
                            "waninterface_ids": null
                        },
                        {
                            "zone_id": "CREW",
                            "lannetwork_ids": null,
                            "interface_ids": [
                                "CREW"
                            ],
                            "wanoverlay_ids": null,
                            "waninterface_ids": null
                        },
                        {
                            "zone_id": "IOT_WIRED",
                            "lannetwork_ids": null,
                            "interface_ids": [
                                "IOT_WIRED"
                            ],
                            "wanoverlay_ids": null,
                            "waninterface_ids": null
                        },
                        {
                            "zone_id": "IOT_WIRELESS",
                            "lannetwork_ids": null,
                            "interface_ids": [
                                "IOT_WIRELESS"
                            ],
                            "wanoverlay_ids": null,
                            "waninterface_ids": null
                        },
                        {
                            "zone_id": "MANAGEMENT",
                            "lannetwork_ids": null,
                            "interface_ids": [
                                "MANAGEMENT"
                            ],
                            "wanoverlay_ids": null,
                            "waninterface_ids": null
                        },
                        {
                            "zone_id": "PRIVATE",
                            "lannetwork_ids": null,
                            "interface_ids": [
                                "PRIVATE"
                            ],
                            "wanoverlay_ids": null,
                            "waninterface_ids": null
                        },
                        {
                            "zone_id": "PUBLIC",
                            "lannetwork_ids": null,
                            "interface_ids": [
                                "PUBLIC"
                            ],
                            "wanoverlay_ids": null,
                            "waninterface_ids": null
                        },
                        {
                            "zone_id": "RESTRICTED",
                            "lannetwork_ids": null,
                            "interface_ids": [
                                "RESTRICTED"
                            ],
                            "wanoverlay_ids": null,
                            "waninterface_ids": null
                        },
                        {
                            "zone_id": "UNTRUSTED",
                            "lannetwork_ids": null,
                            "interface_ids": [
                                "UNTRUSTED"
                            ],
                            "wanoverlay_ids": null,
                            "waninterface_ids": null
                        },
                        {
                            "zone_id": "NATIVE",
                            "lannetwork_ids": null,
                            "interface_ids": [
                                "vlan1"
                            ],
                            "wanoverlay_ids": null,
                            "waninterface_ids": null
                        },
                        {
                            "zone_id": "INTERNET",
                            "lannetwork_ids": null,
                            "interface_ids": null,
                            "wanoverlay_ids": null,
                            "waninterface_ids": [
                                "Backup5GWithVerizon",
                                "PrimaryCircuitWithATT"
                            ]
                        },
                        {
                            "zone_id": "SSE",
                            "lannetwork_ids": null,
                            "interface_ids": null,
                            "wanoverlay_ids": null,
                            "waninterface_ids": null
                        }
                    ],
                    "application_probe v2.0": {
                        "name": "default-probe-configuration-1712188298058014396",
                        "description": null,
                        "tags": null,
                        "enable_probe": true,
                        "source_interface_id": null
                    },
                    "toolkit v2.2": {
                        "ssh_enabled": true,
                        "inactive_interval": 15,
                        "retry_login_count": 5,
                        "account_disable_interval": 5,
                        "otpkey_version": 1,
                        "ssh_outbound_enabled": true
                    }
                }
            }
        }
    },
    "type": "cloudgenix template",
    "sdk_version": "6.3.2b1",
    "config_version": "2.1.0b2"
}`);