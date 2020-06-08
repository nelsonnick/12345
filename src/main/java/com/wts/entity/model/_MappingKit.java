package com.wts.entity.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {
	
	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("allwork", "id", Allwork.class);
		arp.addMapping("expire", "id", Expire.class);
		arp.addMapping("fallback", "id", Fallback.class);
		arp.addMapping("reply", "id", Reply.class);
		arp.addMapping("statistic", "id", Statistic.class);
		arp.addMapping("unhandle", "id", Unhandle.class);
	}
}

