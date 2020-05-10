package com.wts.util;

public class listStr {
    public static String liststr = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\n" +
            "<HTML>\n" +
            "\n" +
            "<HEAD>\n" +
            "\t<title></title>\n" +
            "\t<meta content=\"Microsoft Visual Studio .NET 7.1\" name=\"GENERATOR\">\n" +
            "\t<meta content=\"C#\" name=\"CODE_LANGUAGE\">\n" +
            "\t<meta content=\"JavaScript\" name=\"vs_defaultClientScript\">\n" +
            "\t<meta content=\"http://schemas.microsoft.com/intellisense/ie5\" name=\"vs_targetSchema\">\n" +
            "\t<LINK href=\"../yaweiscripts/pagemanage.css\" type=\"text/css\" rel=\"stylesheet\">\n" +
            "\t<script language=\"javascript\" src=\"../yaweiscripts/basic.js\"></script>\n" +
            "\t<script language=\"javascript\" src=\"Scripts/taskhotLine.js\"></script>\n" +
            "\t<script language=\"javascript\" src=\"Scripts/printname.js\"></script>\n" +
            "\t<script language=\"javascript\" src=\"../yaweiScripts/Calendar.js\"></script>\n" +
            "\t<script language=\"javascript\" src=\"../yaweiScripts/main.js\"></script>\n" +
            "\t<script language=\"javascript\" src=\"../yaweiScripts/xmlHttp.js\"></script>\n" +
            "\t<link href=\"../yaweiScripts/kmenu.css\" type=\"text/css\" rel=\"Stylesheet\" />\n" +
            "\t<script language=\"javascript\" src=\"../yaweiscripts/virtualDirectory.js\"></script>\n" +
            "\t<script language=\"javascript\" src=\"../yaweiScripts/Message.js\"></script>\n" +
            "\t<script src=\"../YaweiScripts/DatePicker/WdatePicker.js\" type=\"text/javascript\"></script>\n" +
            "\n" +
            "</HEAD>\n" +
            "\n" +
            "<body MS_POSITIONING=\"GridLayout\" onload=\"load();\">\n" +
            "\t<TABLE cellSpacing=0 cellPadding=0 width=\"100%\" bgColor=#ffffff border=0>\n" +
            "\t\t<FORM id=formFind name=formFind action=\"\"\n" +
            "\t\t\tonsubmit=\"javascript: findTitle('listtaskhotline.aspx','TaskHotLine.id','');\" method=post width=\"100%\">\n" +
            "\t\t\t<tr class=\"gridFind\" height=\"22\">\n" +
            "\t\t\t\t<td height=\"22\">&nbsp;&nbsp;&nbsp;检索词：&nbsp;<input type=\"text\" id=\"find\" name=\"find\" width=\"26\"><a\n" +
            "\t\t\t\t\t\thref=\"javascript: findTitle('listtaskhotline.aspx','TaskHotLine.id','');\"><img src=\"../images/ny_menu_001.gif\" width=\"55\" height=\"22\" border=\"0\" style=\"vertical-align:bottom\"></a>&nbsp;&nbsp;&nbsp;&nbsp;<a\n" +
            "\t\t\t\t\t\t\thref=\"javascript:showSearchArea();\">高级查询</a></td>\n" +
            "\t\t\t</tr>\n" +
            "\t\t</form>\n" +
            "\t</table>\n" +
            "\t<form name=\"Form1\" method=\"post\" action=\"listTaskHotLine.aspx?MessageType=0&amp;issend=0\" id=\"Form1\"\n" +
            "\t\tstyle=\"MARGIN-TOP: 0px; MARGIN-LEFT: 0px\">\n" +
            "\t\t<div>\n" +
            "\t\t\t<input type=\"hidden\" name=\"__VIEWSTATE\" id=\"__VIEWSTATE\" value=\"/wEPDwUJNTQ4NjE2MzQ3D2QWAmYPZBYCAgMPPCsACwEADxYMHgtfIUl0ZW1Db3VudAIoHghEYXRhS2V5cxYAHglQYWdlQ291bnQCBR4VXyFEYXRhU291cmNlSXRlbUNvdW50Aq0BHhBWaXJ0dWFsSXRlbUNvdW50Aq0BHghQYWdlU2l6ZQIoZGQYAQUeX19Db250cm9sc1JlcXVpcmVQb3N0QmFja0tleV9fFgEFGEpob2FHcmlkMSRjdGwwMiRDaGVja0FsbNf/rdVk0b9B46QAcfUHIhltrpVu\" />\n" +
            "</div>\n" +
            "\n" +
            "\t\t\t<script type=\"text/javascript\" src=\"/jhoa_huaiyinqu/ajax/common.ashx\"></script>\n" +
            "\t\t\t<script type=\"text/javascript\"\n" +
            "\t\t\t\tsrc=\"/jhoa_huaiyinqu/ajax/Yawei.Jhoa.UI.TaskHotLine.ListTaskHotLine,JHOA.ashx\"></script>\n" +
            "\t\t\t<script language=JavaScript>\n" +
            "\t\t\t\tfunction getFormName(){var i;for (i=0; i<document.forms.length; i++){if (document.forms[i]._lkocok_signThisForm != null)return document.forms[i];}return null;}function doGetFormName(){var i;for (i=0; i<document.forms.length; i++){if (document.forms[i]._lkocok_signThisForm != null){/*alert(document.forms[i]);*/return document.forms[i];}}return document.forms[0];}\n" +
            "\t\t\t</script>\n" +
            "\t\t\t<script language='JavaScript'>\n" +
            "\t\t\t\tvar g_currentPersonADFullName='CN=槐荫区人力资源和社会保障局,OU=槐荫区人力资源和社会保障局,OU=槐荫区政府,OU=槐荫区,OU=济南市,DC=jn,DC=gov,DC=cn';\n" +
            "function doColor(item,num) {item.style.color=='#000000';item.className=\"gridHighlight\";}\n" +
            "function undoColor(item,num){\n" +
            "if(num % 2==0){item.className=\"gridEvenRow\";}else{item.className=\"gridOddRow\";}}\n" +
            "\t\t\t</script>\n" +
            "\t\t\t<script language='JavaScript'>\n" +
            "\t\t\t\tfunction resizeGrid(){var tableHeight = getBodyHeightRemained();var lkocokJhoaGridObj = document.getElementById('JhoaGrid1');if (lkocokJhoaGridObj){var gridContainer = lkocokJhoaGridObj.parentElement;if (gridContainer){if (gridContainer.offsetHeight<gridContainer.scrollHeight)gridContainer.style.height=tableHeight-3;}}}\n" +
            "\t\t\t</script>\n" +
            "\t\t\t<script language='JavaScript'>\n" +
            "\t\t\t\tfunction nextPageClick(currPageIndex){\n" +
            "var frm=doGetFormName();if (frm.action.indexOf('?')>0)\n" +
            "frm.action = frm.action+'&pageNo=(parseInt(currPageIndex)+2)'\n" +
            "else frm.action = frm.action+'pageNo=(parseInt(currPageIndex)+2)'\n" +
            "frm.submit();}\n" +
            "function cmbPager(val){\n" +
            "var frm = doGetFormName();\n" +
            "document.all('_lkocok_signThisForm').value='1';\n" +
            "frm.submit();}\n" +
            "function setOperationTypeAndSubmit(operType){document.all('operationType').value=operType;\n" +
            "doGetFormName().submit();}\n" +
            "function addSort(sortColumn){\n" +
            "sortColumn.href = sortColumn.href+\"&sort=\"+document.all('sort').value;}\n" +
            "function addSort2Pager(pagerHyperLink){\n" +
            "pagerHyperLink.href = pagerHyperLink.href+\"&sort=\"+document.all('sort').value+\"&sortColumn=\"+document.all('sortColumn').value;}\n" +
            "\t\t\t</script>\n" +
            "\t\t\t<script language=JavaScript>\n" +
            "\t\t\t\tfunction select_deselectAll (chkVal, idVal) {\n" +
            "var frm;frm=getFormName();\n" +
            "if (frm==null){frm=document.forms[0];} for (i=0; i<frm.length; i++) {\n" +
            " if (idVal.indexOf ('CheckAll') != -1) {\n" +
            " if(chkVal == true) {\n" +
            " frm.elements[i].checked = true;\n" +
            " } else {\n" +
            " frm.elements[i].checked = false;\n" +
            " }\n" +
            " } else if (idVal.indexOf('check_uncheck_This') != -1) {\n" +
            " if(frm.elements[i].checked == false) {\n" +
            " frm.elements[1].checked = false; }\n" +
            " }\n" +
            " }\n" +
            "}\n" +
            "function check_uncheck_All(checkedOrNot) {\n" +
            "var grid = document.getElementById('JhoaGrid1');if (grid){\n" +
            "var inputArray = grid.getElementsByTagName('input');\n" +
            "if (inputArray){\n" +
            "for (var i=0;i<inputArray.length ;i++){\n" +
            "if (inputArray[i].getAttribute('type') == 'checkbox'){\n" +
            "if (inputArray[i].name == 'check_uncheck_This'){\n" +
            "inputArray[i].checked = checkedOrNot;}}}}}}function isOneChecked() {\n" +
            "var frm;\n" +
            "frm=getFormName();\n" +
            "if (frm==null){frm=document.forms[0];}var i;if (!document.getElementById('check_uncheck_This'))return false;if (frm.length<1)return false;for(i=0 ; i<frm.length ;i++){if(frm.item(i).name=='check_uncheck_This')if(frm.item(i).checked)return true;}return false;}function isOnlyOneItemChecked(){var n = 0;\n" +
            "var onlyOneChecked=false;\n" +
            "var theForm = doGetFormName();\n" +
            "if (!document.getElementById('check_uncheck_This'))return false;if (theForm.length<1) return false;\n" +
            "for(var i=0 ; i< theForm.length ;i++){\n" +
            "if(theForm.item(i).name==\"check_uncheck_This\"){\n" +
            "if(theForm.item(i).checked){\n" +
            "onlyOneChecked=true;n++;if(n>1){onlyOneChecked = false;break;}\n" +
            "}}}\n" +
            "return onlyOneChecked;}function getSelectedItems(){\n" +
            "var theForm = doGetFormName();\n" +
            "var checkBoxes = new Array();\n" +
            "if (theForm.length<1 || !isOneChecked()) return null;\n" +
            "for(var i=0 ; i< theForm.length ;i++){\n" +
            "if(theForm.item(i).name==\"check_uncheck_This\"){\n" +
            "if(theForm.item(i).checked){\n" +
            "checkBoxes[checkBoxes.length]=theForm.item(i).value;}}}return checkBoxes;}\n" +
            "function getSelectedValues(param){\n" +
            "var retValues = new Array();\n" +
            "var theForm = doGetFormName();\n" +
            "var c = 'è';\n" +
            "var values = getSelectedItems();if (values==null)return null;\n" +
            "for (var i=0; i<values.length; i++){\n" +
            "var tmp = values[i].split(c);\n" +
            "for (var j=0; j<tmp.length; j++){\n" +
            "var intmp = tmp[j].split('=');\n" +
            "if (intmp[0].toLowerCase()==param.toLowerCase()){\n" +
            "retValues[retValues.length]=intmp[1];break;}}}return retValues;}function getParamValue(param,paramName){\n" +
            "var c = 'è';\n" +
            "var tmp = param.split(c);\n" +
            "for (var j=0; j<tmp.length; j++){\n" +
            "var intmp = tmp[j].split('=');\n" +
            "if (intmp[0].toLowerCase()==paramName.toLowerCase()){\n" +
            "return tmp[j].substr(intmp[0].length+1);}}return null;}\n" +
            "\t\t\t</script>\n" +
            "\t\t\t<div>\n" +
            "\n" +
            "\t\t\t\t<input type=\"hidden\" name=\"__VIEWSTATEGENERATOR\" id=\"__VIEWSTATEGENERATOR\" value=\"CAECE07B\" />\n" +
            "\t\t\t\t<input type=\"hidden\" name=\"__EVENTVALIDATION\" id=\"__EVENTVALIDATION\" value=\"/wEWDALSo/zvDgKfk5XkBwKciorSAgKxuZzKDwLTgZzcDgLy3Z3uCwKAyt2nDQKKhMKUDgKh893yBgKm4dCKDALz1cD2DQKM54rGBiJvMgLY3QG9HeaDThLehmbxNa9k\" />\n" +
            "</div>\n" +
            "\t\t\t\t<LINK href=\"../yaweiScripts/msnMenu.css\" type=\"text/css\" rel=\"stylesheet\">\n" +
            "\t\t\t\t<script language=\"javascript\" src=\"../yaweiScripts/msnMenu.js\"></script>\n" +
            "\t\t\t\t<IFRAME class=\"NN\" id=\"Hfrm\" src=\"about:blank\"></IFRAME>\n" +
            "\t\t\t\t<TABLE class='N' id='HMTB' cellSpacing='0' cellPadding='0' width='100%' border='0'>\n" +
            "\t\t\t\t\t<tr>\n" +
            "\t\t\t\t\t\t<td>\n" +
            "\t\t\t\t\t\t\t<TABLE class='O' id='menuTable' cellSpacing='0' cellPadding='0' width='100%' border='0'>\n" +
            "\t\t\t\t\t\t\t\t<TBODY>\n" +
            "\t\t\t\t\t\t\t\t\t<tr>\n" +
            "\t\t\t\t\t\t\t\t\t\t<TD style=\"WIDTH: 8px\">\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<IMG height=\"1\" src=\"../images/spacer.gif\" width=\"8\"></TD>\n" +
            "\t\t\t\t\t\t\t\t\t\t<td class='P' onmouseover=\"MO()\" onclick=\"javascript:listWriteReport()\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tonmouseout=\"MU()\" noWrap>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<IMG alt=\"下发转办\" hspace=\"1\" src=\"../images/functionkey/bf.gif\" align=\"absMiddle\" border=\"0\">下发转办</TD>\n" +
            "\t\t\t\t\t\t\t\t\t\t<TD class=\"LL\">|</TD>\n" +
            "\t\t\t\t\t\t\t\t\t\t<td class='P' onmouseover=\"MO()\" onclick=\"javascript:printBLD()\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tonmouseout=\"MU()\" noWrap>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<IMG alt=\"打印\" hspace=\"1\" src=\"../images/functionkey/print.gif\" align=\"absMiddle\" border=\"0\">打印1</TD>\n" +
            "\t\t\t\t\t\t\t\t\t\t<TD class=\"LL\">|</TD>\n" +
            "\t\t\t\t\t\t\t\t\t\t<td class='P' onmouseover=\"MO()\" onclick=\"javascript:printBLDnew()\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tonmouseout=\"MU()\" noWrap>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<IMG alt=\"打印\" hspace=\"1\" src=\"../images/functionkey/print.gif\" align=\"absMiddle\" border=\"0\">打印2</TD>\n" +
            "\t\t\t\t\t\t\t\t\t\t<TD class=\"LL\">|</TD>\n" +
            "\t\t\t\t\t\t\t\t\t\t<td class='P' onmouseover=\"MO()\" onclick=\"javascript:outNowBLD()\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tonmouseout=\"MU()\" noWrap>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<IMG alt=\"列表导出(导出相关回复信息)\" hspace=\"1\" src=\"../images/functionkey/excel.gif\" align=\"absMiddle\" border=\"0\">列表导出</TD>\n" +
            "\t\t\t\t\t\t\t\t\t\t<TD class=\"LL\">|</TD>\n" +
            "\t\t\t\t\t\t\t\t\t\t<TD width=\"100%\" align=\"right\"></TD>\n" +
            "\t\t\t\t\t\t\t\t\t</TR>\n" +
            "\t\t\t\t\t\t\t\t</tbody>\n" +
            "\t\t\t\t\t\t\t</TABLE>\n" +
            "\t\t\t\t\t\t</TD>\n" +
            "\t\t\t\t\t\t<TD style='CURSOR: auto'>\n" +
            "\t\t\t\t\t\t\t<TABLE class='O' id='endTable' cellSpacing='0' cellPadding='0' width='100%' border='0'>\n" +
            "\t\t\t\t\t\t\t\t<TR>\n" +
            "\t\t\t\t\t\t\t\t\t<TD width='100%'>&nbsp;</TD>\n" +
            "\t\t\t\t\t\t\t\t</TR>\n" +
            "\t\t\t\t\t\t\t</TABLE>\n" +
            "\t\t\t\t\t\t</TD>\n" +
            "\t\t\t\t\t</TR>\n" +
            "\t\t\t\t</TABLE>\n" +
            "\n" +
            "\t\t\t\t<DIV id='outerDIV'\n" +
            "\t\t\t\t\tstyle=\"height:expression(document.body.offsetHeight-this.offsetTop);width:100%; BORDER-RIGHT: 0px; PADDING-RIGHT: 0px; BORDER-TOP: 0px; PADDING-LEFT: 0px; BORDER-BOTTOM-WIDTH: 0px; PADDING-BOTTOM: 0px; MARGIN: 0px;margin-bottom:0px; OVERFLOW: auto; BORDER-LEFT: 0px; PADDING-TOP: 0px; \">\n" +
            "\t\t\t\t\t<DIV\n" +
            "\t\t\t\t\t\tstyle=\"BORDER-RIGHT: 0px;width:100%; PADDING-RIGHT: 0px; BORDER-TOP: 0px; PADDING-LEFT: 0px; BORDER-BOTTOM-WIDTH: 0px; PADDING-BOTTOM: 0px; MARGIN: 0px; OVERFLOW: auto;margin-bottom:0px; BORDER-LEFT: 0px; PADDING-TOP: 0px; HEIGHT:'445px';\">\n" +
            "\t\t\t\t\t\t<input type='hidden' id='_lkocok_signThisForm' name='_lkocok_signThisForm' value='0' style='width:0'><input type='hidden' id='operationType' name='operationType' value='' style='width:0'><input type='hidden' id='sort' name='sort' value='desc'><input type='hidden' id='sortColumn' name='sortColumn' value='sendTime'>\n" +
            "\t\t\t\t\t\t<table cellspacing=\"1\" cellpadding=\"0\" border=\"0\" id=\"JhoaGrid1\"\n" +
            "\t\t\t\t\t\t\tstyle=\"font-size:12px;width:100%;TOP:0px;LEFT:0px;MARGIN-TOP:0px;MARGIN-LEFT:0px;width:100%;table-layout:fixed;\">\n" +
            "\t\t\t\t\t\t\t<tr style='TOP: expression(this.offsetParent.scrollTop-1);POSITION: relative;'>\n" +
            "\t\t\t\t\t\t\t\t<td class=\"gridHead\" style=\"width:6%;\">\n" +
            "\t\t\t\t\t\t\t\t\t<input id=\"JhoaGrid1_ctl02_CheckAll\" type=\"checkbox\" name=\"JhoaGrid1$ctl02$CheckAll\" onclick=\"check_uncheck_All(this.checked);\" /><label for=\"JhoaGrid1_ctl02_CheckAll\">全选</label>\n" +
            "\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t<td class=\"gridHead\" align=\"center\" valign=\"middle\" style=\"width:12%;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\tonclick=\"return addSort(this)\"\n" +
            "\t\t\t\t\t\t\t\t\t\thref=\"?sortColumn=id&whereSql= and  issend=0 and messageType=0 and (gdzt!=3 or gdzt is null)  and ownerguid='c443f956-8101-48ec-bf0a-80c97039a90e' \"\n" +
            "\t\t\t\t\t\t\t\t\t\ttitle=\"点击可按“工单编号”排序\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<font class=\"headerSortFont\">工单编号</font>\n" +
            "\t\t\t\t\t\t\t\t\t</a></td>\n" +
            "\t\t\t\t\t\t\t\t<td class=\"gridHead\" align=\"center\" valign=\"middle\" style=\"width:8%;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\tonclick=\"return addSort(this)\"\n" +
            "\t\t\t\t\t\t\t\t\t\thref=\"?sortColumn=urgencyDegree&whereSql= and  issend=0 and messageType=0 and (gdzt!=3 or gdzt is null)  and ownerguid='c443f956-8101-48ec-bf0a-80c97039a90e' \"\n" +
            "\t\t\t\t\t\t\t\t\t\ttitle=\"点击可按“紧急程度”排序\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<font class=\"headerSortFont\">紧急程度</font>\n" +
            "\t\t\t\t\t\t\t\t\t</a></td>\n" +
            "\t\t\t\t\t\t\t\t<td class=\"gridHead\" align=\"center\" valign=\"middle\" style=\"width:10%;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\tonclick=\"return addSort(this)\"\n" +
            "\t\t\t\t\t\t\t\t\t\thref=\"?sortColumn=enddate&whereSql= and  issend=0 and messageType=0 and (gdzt!=3 or gdzt is null)  and ownerguid='c443f956-8101-48ec-bf0a-80c97039a90e' \"\n" +
            "\t\t\t\t\t\t\t\t\t\ttitle=\"点击可按“办理时限”排序\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<font class=\"headerSortFont\">办理时限</font>\n" +
            "\t\t\t\t\t\t\t\t\t</a></td>\n" +
            "\t\t\t\t\t\t\t\t<td class=\"gridHead\" align=\"center\" valign=\"middle\" style=\"width:10%;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\tonclick=\"return addSort(this)\"\n" +
            "\t\t\t\t\t\t\t\t\t\thref=\"?sortColumn=sendtime&whereSql= and  issend=0 and messageType=0 and (gdzt!=3 or gdzt is null)  and ownerguid='c443f956-8101-48ec-bf0a-80c97039a90e' \"\n" +
            "\t\t\t\t\t\t\t\t\t\ttitle=\"点击可按“发送时间”排序\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<font class=\"headerSortFont\">发送时间</font>\n" +
            "\t\t\t\t\t\t\t\t\t</a></td>\n" +
            "\t\t\t\t\t\t\t\t<td class=\"gridHead\" align=\"center\" valign=\"middle\" style=\"width:20%;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\tonclick=\"return addSort(this)\"\n" +
            "\t\t\t\t\t\t\t\t\t\thref=\"?sortColumn=wtms&whereSql= and  issend=0 and messageType=0 and (gdzt!=3 or gdzt is null)  and ownerguid='c443f956-8101-48ec-bf0a-80c97039a90e' \"\n" +
            "\t\t\t\t\t\t\t\t\t\ttitle=\"点击可按“问题描述”排序\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<font class=\"headerSortFont\">问题描述</font>\n" +
            "\t\t\t\t\t\t\t\t\t</a></td>\n" +
            "\t\t\t\t\t\t\t\t<td class=\"gridHead\" align=\"center\" valign=\"middle\" style=\"width:10%;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\tonclick=\"return addSort(this)\"\n" +
            "\t\t\t\t\t\t\t\t\t\thref=\"?sortColumn=ifbm&whereSql= and  issend=0 and messageType=0 and (gdzt!=3 or gdzt is null)  and ownerguid='c443f956-8101-48ec-bf0a-80c97039a90e' \"\n" +
            "\t\t\t\t\t\t\t\t\t\ttitle=\"点击可按“是否保密”排序\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<font class=\"headerSortFont\">是否保密</font>\n" +
            "\t\t\t\t\t\t\t\t\t</a></td>\n" +
            "\t\t\t\t\t\t\t\t<td class=\"gridHead\" align=\"center\" valign=\"middle\" style=\"width:10%;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\tonclick=\"return addSort(this)\"\n" +
            "\t\t\t\t\t\t\t\t\t\thref=\"?sortColumn=isreply&whereSql= and  issend=0 and messageType=0 and (gdzt!=3 or gdzt is null)  and ownerguid='c443f956-8101-48ec-bf0a-80c97039a90e' \"\n" +
            "\t\t\t\t\t\t\t\t\t\ttitle=\"点击可按“是否需回复”排序\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<font class=\"headerSortFont\">是否需回复</font>\n" +
            "\t\t\t\t\t\t\t\t\t</a></td>\n" +
            "\t\t\t\t\t\t\t\t<td class=\"gridHead\" align=\"center\" valign=\"middle\" style=\"width:10%;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\tonclick=\"return addSort(this)\"\n" +
            "\t\t\t\t\t\t\t\t\t\thref=\"?sortColumn=sendperson&whereSql= and  issend=0 and messageType=0 and (gdzt!=3 or gdzt is null)  and ownerguid='c443f956-8101-48ec-bf0a-80c97039a90e' \"\n" +
            "\t\t\t\t\t\t\t\t\t\ttitle=\"点击可按“发送人”排序\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<font class=\"headerSortFont\">发送人</font>\n" +
            "\t\t\t\t\t\t\t\t\t</a></td>\n" +
            "\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t<tbody>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridEvenRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={00e81943-7b9a-4bd5-b6a0-08a143df4b0b}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200507112037658432\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={00e81943-7b9a-4bd5-b6a0-08a143df4b0b}&amp;IsZDDB=&amp;\">200507112037658432</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={00e81943-7b9a-4bd5-b6a0-08a143df4b0b}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-12\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={00e81943-7b9a-4bd5-b6a0-08a143df4b0b}&amp;IsZDDB=&amp;\">2020-05-12</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/9 10:05:29\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={00e81943-7b9a-4bd5-b6a0-08a143df4b0b}&amp;IsZDDB=&amp;\">2020/5/9\n" +
            "\t\t\t\t\t\t\t\t\t\t\t10:05:29</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"王女士来电反映：自己在槐荫区缴纳的灵活就业养老与医疗保险，每月存款1500元，不清楚缴纳的哪一个档次，现在查询到医保卡内余额为0，咨询是何原因。（身份证号370112198210163969）  （已按知识库解释，来电人不认可，强烈要求职能单位给予解释）希望相关单位落实处理，请处理并回复来电人。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={00e81943-7b9a-4bd5-b6a0-08a143df4b0b}&amp;IsZDDB=&amp;\">王女士来电反映：自己在槐荫区缴纳的灵活就业养老与医疗保险，每月存款1500元，不清楚缴纳的哪一个档次，现在查询到医保卡内余额为0，咨询是何原因。（身份证号370112198210163969）\n" +
            "\t\t\t\t\t\t\t\t\t\t\t（已按知识库解释，来电人不认可，强烈要求职能单位给予解释）希望相关单位落实处理，请处理并回复来电人。智慧泉城</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={00e81943-7b9a-4bd5-b6a0-08a143df4b0b}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={00e81943-7b9a-4bd5-b6a0-08a143df4b0b}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={00e81943-7b9a-4bd5-b6a0-08a143df4b0b}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridOddRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={94068f55-288c-4c65-91e1-b00a98007173}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200509091336401186\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={94068f55-288c-4c65-91e1-b00a98007173}&amp;IsZDDB=&amp;\">200509091336401186</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={94068f55-288c-4c65-91e1-b00a98007173}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-14\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={94068f55-288c-4c65-91e1-b00a98007173}&amp;IsZDDB=&amp;\">2020-05-14</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/9 9:58:51\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={94068f55-288c-4c65-91e1-b00a98007173}&amp;IsZDDB=&amp;\">2020/5/9\n" +
            "\t\t\t\t\t\t\t\t\t\t\t9:58:51</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"韩女士来电反映：槐荫区企业，通过山东高校毕业生就业信息网站与毕业生签网签，选择的尚未办理托管暂不接收档案，需要将档案返回原地办理调档，但也需要公司到工商注册地公共就业服务中心提供免费的托管业务，咨询提供什么资料办理托管业务。希望相关单位落实处理，请处理并回复来电人。  智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={94068f55-288c-4c65-91e1-b00a98007173}&amp;IsZDDB=&amp;\">韩女士来电反映：槐荫区企业，通过山东高校毕业生就业信息网站与毕业生签网签，选择的尚未办理托管暂不接收档案，需要将档案返回原地办理调档，但也需要公司到工商注册地公共就业服务中心提供免费的托管业务，咨询提供什么资料办理托管业务。希望相关单位落实处理，请处理并回复来电人。\n" +
            "\t\t\t\t\t\t\t\t\t\t\t智慧泉城</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={94068f55-288c-4c65-91e1-b00a98007173}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={94068f55-288c-4c65-91e1-b00a98007173}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={94068f55-288c-4c65-91e1-b00a98007173}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridEvenRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={96b7825a-8a8e-4843-9294-7afe3e591a48}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200502120853916475\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={96b7825a-8a8e-4843-9294-7afe3e591a48}&amp;IsZDDB=&amp;\">200502120853916475</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={96b7825a-8a8e-4843-9294-7afe3e591a48}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-11\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={96b7825a-8a8e-4843-9294-7afe3e591a48}&amp;IsZDDB=&amp;\">2020-05-11</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/9 9:56:11\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={96b7825a-8a8e-4843-9294-7afe3e591a48}&amp;IsZDDB=&amp;\">2020/5/9\n" +
            "\t\t\t\t\t\t\t\t\t\t\t9:56:11</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"胡女士来电反映：在槐荫区以灵活就业方式缴纳医保，咨询女满40周岁、男满50周岁是否有相应补贴，希望相关单位落实处理，请处理并回复来电人。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={96b7825a-8a8e-4843-9294-7afe3e591a48}&amp;IsZDDB=&amp;\">胡女士来电反映：在槐荫区以灵活就业方式缴纳医保，咨询女满40周岁、男满50周岁是否有相应补贴，希望相关单位落实处理，请处理并回复来电人。智慧泉城</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={96b7825a-8a8e-4843-9294-7afe3e591a48}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={96b7825a-8a8e-4843-9294-7afe3e591a48}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={96b7825a-8a8e-4843-9294-7afe3e591a48}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridOddRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={2bb43a3f-a205-47ad-b575-fe4c58a2e936}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200509073306651168\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={2bb43a3f-a205-47ad-b575-fe4c58a2e936}&amp;IsZDDB=&amp;\">200509073306651168</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={2bb43a3f-a205-47ad-b575-fe4c58a2e936}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-14\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={2bb43a3f-a205-47ad-b575-fe4c58a2e936}&amp;IsZDDB=&amp;\">2020-05-14</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/9 8:52:33\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={2bb43a3f-a205-47ad-b575-fe4c58a2e936}&amp;IsZDDB=&amp;\">2020/5/9\n" +
            "\t\t\t\t\t\t\t\t\t\t\t8:52:33</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"李先生来电反映：2019年8月至今在槐荫区顺安路高铁围合南工地A3地块工作（农民工）至今没有签订劳动合同，施工方：中间八局，没有相关的联系方式，要求按照工资支付标准签订劳动合同，希望相关部门帮助落实处理。请处理。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={2bb43a3f-a205-47ad-b575-fe4c58a2e936}&amp;IsZDDB=&amp;\">李先生来电反映：2019年8月至今在槐荫区顺安路高铁围合南工地A3地块工作（农民工）至今没有签订劳动合同，施工方：中间八局，没有相关的联系方式，要求按照工资支付标准签订劳动合同，希望相关部门帮助落实处理。请处理。智慧泉城</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={2bb43a3f-a205-47ad-b575-fe4c58a2e936}&amp;IsZDDB=&amp;\">保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={2bb43a3f-a205-47ad-b575-fe4c58a2e936}&amp;IsZDDB=&amp;\">不需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={2bb43a3f-a205-47ad-b575-fe4c58a2e936}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridEvenRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={7465718d-9e77-4965-8604-b8089a76abb7}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200508185708222136\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={7465718d-9e77-4965-8604-b8089a76abb7}&amp;IsZDDB=&amp;\">200508185708222136</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={7465718d-9e77-4965-8604-b8089a76abb7}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-14\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={7465718d-9e77-4965-8604-b8089a76abb7}&amp;IsZDDB=&amp;\">2020-05-14</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/9 8:48:49\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={7465718d-9e77-4965-8604-b8089a76abb7}&amp;IsZDDB=&amp;\">2020/5/9\n" +
            "\t\t\t\t\t\t\t\t\t\t\t8:48:49</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"周女士来电反映：在槐荫区腊山河东路齐鲁装饰材料市场沿街楼6楼语洁滤清能源科技有限公司，工作了7天（2020年4月9日-2020年4月15日），去面试的前台，公司说前台不缺人安排到了客服，在客服干到第七天公司让转到销售，自己不同意转岗就被公司辞退，到现在工资未到账，跟公司联系，公司说自己没有工资，但老板承诺5月8日发工资，认为在网络上散布虚假招聘内容，要求投诉该公司并且返还工资。  希望相关单位落实处理，请处理并回复来电人。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={7465718d-9e77-4965-8604-b8089a76abb7}&amp;IsZDDB=&amp;\">周女士来电反映：在槐荫区腊山河东路齐鲁装饰材料市场沿街楼6楼语洁滤清能源科技有限公司，工作了7天（2020年4月9日-2020年4月15日），去面试的前台，公司说前台不缺人安排到了客服，在客服干到第七天公司让转到销售，自己不同意转岗就被公司辞退，到现在工资未到账，跟公司联系，公司说自己没有工资，但老板承诺5月8日发工资，认为在网络上散布虚假招聘内容，要求投诉该公司并且返还工资。\n" +
            "\t\t\t\t\t\t\t\t\t\t\t希望相关单位落实处理，请处理并回复来电人。智慧泉城</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={7465718d-9e77-4965-8604-b8089a76abb7}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={7465718d-9e77-4965-8604-b8089a76abb7}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={7465718d-9e77-4965-8604-b8089a76abb7}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridOddRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={06ec92ba-7dc5-44e1-95cd-2783b56d9a3f}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200508181202546569\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={06ec92ba-7dc5-44e1-95cd-2783b56d9a3f}&amp;IsZDDB=&amp;\">200508181202546569</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={06ec92ba-7dc5-44e1-95cd-2783b56d9a3f}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={06ec92ba-7dc5-44e1-95cd-2783b56d9a3f}&amp;IsZDDB=&amp;\">2020-05-13</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 21:11:51\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={06ec92ba-7dc5-44e1-95cd-2783b56d9a3f}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t21:11:51</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"孙女士来电反映：4月28日在山东晟惟信用管理有限公司入职（公司地址：槐荫区绿地新城D区D2-14楼1411室）5月8日公司人事以不适合这份工作为由将来电人及其同事辞退（共两人孙鹤37142519981214286X、韩文娴30832200006012825）工作11天合计2000元，单位联系人称不会给来电人及其同事结算工资（单位联系人：姜女士15165126381）。认为不合理，要求公司尽快结清工资。  希望相关单位落实处理，请处理并回复来电人。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={06ec92ba-7dc5-44e1-95cd-2783b56d9a3f}&amp;IsZDDB=&amp;\">孙女士来电反映：4月28日在山东晟惟信用管理有限公司入职（公司地址：槐荫区绿地新城D区D2-14楼1411室）5月8日公司人事以不适合这份工作为由将来电人及其同事辞退（共两人孙鹤37142519981214286X、韩文娴30832200006012825）工作11天合计2000元，单位联系人称不会给来电人及其同事结算工资（单位联系人：姜女士15165126381）。认为不合理，要求公司尽快结清工资。\n" +
            "\t\t\t\t\t\t\t\t\t\t\t希望相关单位落实处理，请处理并回复来电人。智慧泉城</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={06ec92ba-7dc5-44e1-95cd-2783b56d9a3f}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={06ec92ba-7dc5-44e1-95cd-2783b56d9a3f}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={06ec92ba-7dc5-44e1-95cd-2783b56d9a3f}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridEvenRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={ebd8f044-6dce-4689-b5b0-c3d964b1c5ee}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200508160459499240\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={ebd8f044-6dce-4689-b5b0-c3d964b1c5ee}&amp;IsZDDB=&amp;\">200508160459499240</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={ebd8f044-6dce-4689-b5b0-c3d964b1c5ee}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={ebd8f044-6dce-4689-b5b0-c3d964b1c5ee}&amp;IsZDDB=&amp;\">2020-05-13</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 19:17:04\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={ebd8f044-6dce-4689-b5b0-c3d964b1c5ee}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t19:17:04</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"孟先生来电反映：4月20日开始在槐荫区经十西路239号驰奥汽车贴膜服务机构工作，5月6日离职，至今拖欠工资3000元，要求尽快结清，无劳动合同。 希望相关单位落实处理，请处理并回复来电人。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={ebd8f044-6dce-4689-b5b0-c3d964b1c5ee}&amp;IsZDDB=&amp;\">孟先生来电反映：4月20日开始在槐荫区经十西路239号驰奥汽车贴膜服务机构工作，5月6日离职，至今拖欠工资3000元，要求尽快结清，无劳动合同。\n" +
            "\t\t\t\t\t\t\t\t\t\t\t希望相关单位落实处理，请处理并回复来电人。智慧泉城</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={ebd8f044-6dce-4689-b5b0-c3d964b1c5ee}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={ebd8f044-6dce-4689-b5b0-c3d964b1c5ee}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={ebd8f044-6dce-4689-b5b0-c3d964b1c5ee}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridOddRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={d4e978fd-e129-4d22-a719-cf98beee94bd}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200508155753861918\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d4e978fd-e129-4d22-a719-cf98beee94bd}&amp;IsZDDB=&amp;\">200508155753861918</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d4e978fd-e129-4d22-a719-cf98beee94bd}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d4e978fd-e129-4d22-a719-cf98beee94bd}&amp;IsZDDB=&amp;\">2020-05-13</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 18:19:47\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d4e978fd-e129-4d22-a719-cf98beee94bd}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t18:19:47</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"李先生来电反映：自己在槐荫区青岛路和齐州路交叉口，山东通海装饰工程有限公司，陈庆华承包中建八局中建锦绣城办公楼的项目工作，拖欠自己1万1千元的工资没有支付，希望尽快协调拿到工资。希望相关单位落实处理，请处理并回复来电人。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d4e978fd-e129-4d22-a719-cf98beee94bd}&amp;IsZDDB=&amp;\">李先生来电反映：自己在槐荫区青岛路和齐州路交叉口，山东通海装饰工程有限公司，陈庆华承包中建八局中建锦绣城办公楼的项目工作，拖欠自己1万1千元的工资没有支付，希望尽快协调拿到工资。希望相关单位落实处理，请处理并回复来电人。智慧泉城</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d4e978fd-e129-4d22-a719-cf98beee94bd}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d4e978fd-e129-4d22-a719-cf98beee94bd}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d4e978fd-e129-4d22-a719-cf98beee94bd}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridEvenRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={bc87a0f5-1ef9-40ad-bb90-bd52aac4d34c}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200508113015137876\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={bc87a0f5-1ef9-40ad-bb90-bd52aac4d34c}&amp;IsZDDB=&amp;\">200508113015137876</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={bc87a0f5-1ef9-40ad-bb90-bd52aac4d34c}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={bc87a0f5-1ef9-40ad-bb90-bd52aac4d34c}&amp;IsZDDB=&amp;\">2020-05-13</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 17:15:48\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={bc87a0f5-1ef9-40ad-bb90-bd52aac4d34c}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t17:15:48</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"裴女士来电反映：2016年在天桥区单位工作，正常缴纳职工养老保险，5月8日登陆社会保险事业中心网站查询时未查询到2016年养老缴费信息，咨询是何原因是否已经正常缴费，身份证号码：370103199311168521，  希望相关单位落实处理，请处理并回复来电人。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={bc87a0f5-1ef9-40ad-bb90-bd52aac4d34c}&amp;IsZDDB=&amp;\">裴女士来电反映：2016年在天桥区单位工作，正常缴纳职工养老保险，5月8日登陆社会保险事业中心网站查询时未查询到2016年养老缴费信息，咨询是何原因是否已经正常缴费，身份证号码：370103199311168521，\n" +
            "\t\t\t\t\t\t\t\t\t\t\t希望相关单位落实处理，请处理并回复来电人。智慧泉城</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={bc87a0f5-1ef9-40ad-bb90-bd52aac4d34c}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={bc87a0f5-1ef9-40ad-bb90-bd52aac4d34c}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={bc87a0f5-1ef9-40ad-bb90-bd52aac4d34c}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridOddRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={bd581379-8fe7-441e-87f0-51b593510a33}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200508165122771392\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={bd581379-8fe7-441e-87f0-51b593510a33}&amp;IsZDDB=&amp;\">200508165122771392</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={bd581379-8fe7-441e-87f0-51b593510a33}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={bd581379-8fe7-441e-87f0-51b593510a33}&amp;IsZDDB=&amp;\">2020-05-13</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 17:12:54\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={bd581379-8fe7-441e-87f0-51b593510a33}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t17:12:54</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"陈磊先生来电反映：槐荫区舜祥新区户籍，来电查询个人档案在哪里。（身份证：370104198312260014）  希望相关单位落实处理，请处理并回复来电人。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={bd581379-8fe7-441e-87f0-51b593510a33}&amp;IsZDDB=&amp;\">陈磊先生来电反映：槐荫区舜祥新区户籍，来电查询个人档案在哪里。（身份证：370104198312260014）\n" +
            "\t\t\t\t\t\t\t\t\t\t\t希望相关单位落实处理，请处理并回复来电人。智慧泉城</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={bd581379-8fe7-441e-87f0-51b593510a33}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={bd581379-8fe7-441e-87f0-51b593510a33}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={bd581379-8fe7-441e-87f0-51b593510a33}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridEvenRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={b2996619-80e9-47a4-87a4-7aaa2a13a7b0}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200508142224155106\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={b2996619-80e9-47a4-87a4-7aaa2a13a7b0}&amp;IsZDDB=&amp;\">200508142224155106</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={b2996619-80e9-47a4-87a4-7aaa2a13a7b0}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={b2996619-80e9-47a4-87a4-7aaa2a13a7b0}&amp;IsZDDB=&amp;\">2020-05-13</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 16:48:20\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={b2996619-80e9-47a4-87a4-7aaa2a13a7b0}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t16:48:20</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"卢先生来电反映：4月30日将自己的中级电气工程师证书以及相关复印件寄到槐荫区经十路28988号乐梦中心4号楼2025睿智娜合企业管理咨询有限公司（侯希坤13335190460,13075358079），已签订证书挂靠合同表示挂一年支付6500元（先支付后使用证书），但是寄到公司后负责人不予支付费用，联系负责人告知在合同到期后再支付费用，对此不满，要求按照合同流程进行尽快支付费用，  希望相关单位落实处理，请处理并回复来电人。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={b2996619-80e9-47a4-87a4-7aaa2a13a7b0}&amp;IsZDDB=&amp;\">卢先生来电反映：4月30日将自己的中级电气工程师证书以及相关复印件寄到槐荫区经十路28988号乐梦中心4号楼2025睿智娜合企业管理咨询有限公司（侯希坤13335190460,13075358079），已签订证书挂靠合同表示挂一年支付6500元（先支付后使用证书），但是寄到公司后负责人不予支付费用，联系负责人告知在合同到期后再支付费用，对此不满，要求按照合同流程进行尽快支付费用，\n" +
            "\t\t\t\t\t\t\t\t\t\t\t希望相关单位落实处理，请处理并回复来电人。智慧泉城</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={b2996619-80e9-47a4-87a4-7aaa2a13a7b0}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={b2996619-80e9-47a4-87a4-7aaa2a13a7b0}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={b2996619-80e9-47a4-87a4-7aaa2a13a7b0}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridOddRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={8a40ec6c-98f4-4951-908c-84b7560a79a7}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200508161449534759\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={8a40ec6c-98f4-4951-908c-84b7560a79a7}&amp;IsZDDB=&amp;\">200508161449534759</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={8a40ec6c-98f4-4951-908c-84b7560a79a7}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={8a40ec6c-98f4-4951-908c-84b7560a79a7}&amp;IsZDDB=&amp;\">2020-05-13</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 16:35:46\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={8a40ec6c-98f4-4951-908c-84b7560a79a7}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t16:35:46</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"王菲女士来电反映：2010年10月在山东鲁刊工程检测鉴定有限公司（槐荫区美里路777号）任职，2017年9月离职后一直找不到自己档案，来电求助帮助查找档案。（身份证号：371425198703050021）希望相关单位落实处理，请处理并回复来电人。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={8a40ec6c-98f4-4951-908c-84b7560a79a7}&amp;IsZDDB=&amp;\">王菲女士来电反映：2010年10月在山东鲁刊工程检测鉴定有限公司（槐荫区美里路777号）任职，2017年9月离职后一直找不到自己档案，来电求助帮助查找档案。（身份证号：371425198703050021）希望相关单位落实处理，请处理并回复来电人。智慧泉城</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={8a40ec6c-98f4-4951-908c-84b7560a79a7}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={8a40ec6c-98f4-4951-908c-84b7560a79a7}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={8a40ec6c-98f4-4951-908c-84b7560a79a7}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridEvenRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={e4754fa9-099f-4498-be0c-a7049916ebe1}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200508143755716141\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={e4754fa9-099f-4498-be0c-a7049916ebe1}&amp;IsZDDB=&amp;\">200508143755716141</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={e4754fa9-099f-4498-be0c-a7049916ebe1}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={e4754fa9-099f-4498-be0c-a7049916ebe1}&amp;IsZDDB=&amp;\">2020-05-13</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 16:02:55\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={e4754fa9-099f-4498-be0c-a7049916ebe1}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t16:02:55</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"宋女士来电反映：公司在槐荫区，现在公司因疫情原因一直没有营业，公司一直在亏损现在需要进行裁员，咨询裁员是否需要给员工进行一定的补偿。希望相关单位落实处理，请处理并回复来电人。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={e4754fa9-099f-4498-be0c-a7049916ebe1}&amp;IsZDDB=&amp;\">宋女士来电反映：公司在槐荫区，现在公司因疫情原因一直没有营业，公司一直在亏损现在需要进行裁员，咨询裁员是否需要给员工进行一定的补偿。希望相关单位落实处理，请处理并回复来电人。智慧泉城</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={e4754fa9-099f-4498-be0c-a7049916ebe1}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={e4754fa9-099f-4498-be0c-a7049916ebe1}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={e4754fa9-099f-4498-be0c-a7049916ebe1}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridOddRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={0a9112e3-eeaf-4844-a6bd-fe88ce68e193}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200508151811225139\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={0a9112e3-eeaf-4844-a6bd-fe88ce68e193}&amp;IsZDDB=&amp;\">200508151811225139</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={0a9112e3-eeaf-4844-a6bd-fe88ce68e193}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={0a9112e3-eeaf-4844-a6bd-fe88ce68e193}&amp;IsZDDB=&amp;\">2020-05-13</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 15:57:04\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={0a9112e3-eeaf-4844-a6bd-fe88ce68e193}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t15:57:04</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"匿名先生来电反映：槐荫区外海汽配城融尚国际跆拳道，自己是教练员，2019年10月入职，12月辞职回家，商家告知非常看重自己，让自己年后回到单位正常工作，给自己报销房租，现在单位房租与工资都不给自己发放，不给予签订合同，要求投诉，  希望相关单位落实处理，请处理并回复来电人。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={0a9112e3-eeaf-4844-a6bd-fe88ce68e193}&amp;IsZDDB=&amp;\">匿名先生来电反映：槐荫区外海汽配城融尚国际跆拳道，自己是教练员，2019年10月入职，12月辞职回家，商家告知非常看重自己，让自己年后回到单位正常工作，给自己报销房租，现在单位房租与工资都不给自己发放，不给予签订合同，要求投诉，\n" +
            "\t\t\t\t\t\t\t\t\t\t\t希望相关单位落实处理，请处理并回复来电人。智慧泉城</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={0a9112e3-eeaf-4844-a6bd-fe88ce68e193}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={0a9112e3-eeaf-4844-a6bd-fe88ce68e193}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={0a9112e3-eeaf-4844-a6bd-fe88ce68e193}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridEvenRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={0fa289b5-31c5-4d6d-b43d-0643a4a3c870}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200508152339068815\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={0fa289b5-31c5-4d6d-b43d-0643a4a3c870}&amp;IsZDDB=&amp;\">200508152339068815</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={0fa289b5-31c5-4d6d-b43d-0643a4a3c870}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={0fa289b5-31c5-4d6d-b43d-0643a4a3c870}&amp;IsZDDB=&amp;\">2020-05-13</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 15:55:39\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={0fa289b5-31c5-4d6d-b43d-0643a4a3c870}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t15:55:39</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"尹先生来电反映：从2019年10月份开始在槐荫区汽配城内的振邦公司工作，在4月底离职，但自己疫情期间只发放3000元的工资，但后期自己退还单位1600元的费用，来电求助，要求给予合理解释，希望相关单位落实处理，请处理并回复来电人。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={0fa289b5-31c5-4d6d-b43d-0643a4a3c870}&amp;IsZDDB=&amp;\">尹先生来电反映：从2019年10月份开始在槐荫区汽配城内的振邦公司工作，在4月底离职，但自己疫情期间只发放3000元的工资，但后期自己退还单位1600元的费用，来电求助，要求给予合理解释，希望相关单位落实处理，请处理并回复来电人。智慧泉城</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={0fa289b5-31c5-4d6d-b43d-0643a4a3c870}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={0fa289b5-31c5-4d6d-b43d-0643a4a3c870}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={0fa289b5-31c5-4d6d-b43d-0643a4a3c870}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridOddRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={31b3014e-ac87-4d0d-8e59-16d78c1e2dd8}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200508140730941862\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={31b3014e-ac87-4d0d-8e59-16d78c1e2dd8}&amp;IsZDDB=&amp;\">200508140730941862</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={31b3014e-ac87-4d0d-8e59-16d78c1e2dd8}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={31b3014e-ac87-4d0d-8e59-16d78c1e2dd8}&amp;IsZDDB=&amp;\">2020-05-13</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 15:42:13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={31b3014e-ac87-4d0d-8e59-16d78c1e2dd8}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t15:42:13</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"朱先生来电反映：槐荫区小微企业创业担保贷款和个人创业担保贷款是否需要抵押和担保人，以及小微企业创业担保贷款如何申请。  希望相关单位落实处理，请处理并回复来电人。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={31b3014e-ac87-4d0d-8e59-16d78c1e2dd8}&amp;IsZDDB=&amp;\">朱先生来电反映：槐荫区小微企业创业担保贷款和个人创业担保贷款是否需要抵押和担保人，以及小微企业创业担保贷款如何申请。\n" +
            "\t\t\t\t\t\t\t\t\t\t\t希望相关单位落实处理，请处理并回复来电人。智慧泉城</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={31b3014e-ac87-4d0d-8e59-16d78c1e2dd8}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={31b3014e-ac87-4d0d-8e59-16d78c1e2dd8}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={31b3014e-ac87-4d0d-8e59-16d78c1e2dd8}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridEvenRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={5a319f28-0269-494f-8121-4ab826308110}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/org.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200430144917033402\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={5a319f28-0269-494f-8121-4ab826308110}&amp;IsZDDB=&amp;\">200430144917033402</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={5a319f28-0269-494f-8121-4ab826308110}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-09\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={5a319f28-0269-494f-8121-4ab826308110}&amp;IsZDDB=&amp;\">2020-05-09</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 15:37:07\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={5a319f28-0269-494f-8121-4ab826308110}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t15:37:07</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"吕女士来电反映：自己在槐荫区兴福街道绿地中央广场C3地块A座3楼济南智泉文化发展有限公司发展有限公司申请5月离职，负责人：徐先生，13256179657，053188989130，自己从事出版加工中心的工作，扣除自己上一年度的工资量，认为不合理，投诉公司，希望合理发放工资，尽快出具离职证明，以及办理减员。希望相关单位落实处理，请处理并回复来电人。\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={5a319f28-0269-494f-8121-4ab826308110}&amp;IsZDDB=&amp;\">吕女士来电反映：自己在槐荫区兴福街道绿地中央广场C3地块A座3楼济南智泉文化发展有限公司发展有限公司申请5月离职，负责人：徐先生，13256179657，053188989130，自己从事出版加工中心的工作，扣除自己上一年度的工资量，认为不合理，投诉公司，希望合理发放工资，尽快出具离职证明，以及办理减员。希望相关单位落实处理，请处理并回复来电人。</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={5a319f28-0269-494f-8121-4ab826308110}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={5a319f28-0269-494f-8121-4ab826308110}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={5a319f28-0269-494f-8121-4ab826308110}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridOddRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={c4435b2a-c113-4aba-92bb-8fa4cd6501fc}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/org.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200506120926531142\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={c4435b2a-c113-4aba-92bb-8fa4cd6501fc}&amp;IsZDDB=&amp;\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tstyle=\"color:#FF0000;\">200506120926531142</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"紧急\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={c4435b2a-c113-4aba-92bb-8fa4cd6501fc}&amp;IsZDDB=&amp;\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tstyle=\"color:#FF0000;\">紧急</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-09\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={c4435b2a-c113-4aba-92bb-8fa4cd6501fc}&amp;IsZDDB=&amp;\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tstyle=\"color:#FF0000;\">2020-05-09</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 15:34:50\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={c4435b2a-c113-4aba-92bb-8fa4cd6501fc}&amp;IsZDDB=&amp;\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tstyle=\"color:#FF0000;\">2020/5/8 15:34:50</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"李先生来电反映：3月15日左右到槐荫区青岛路与顺安路山东省建工集团工作，应4月21日发放工资，至今未发放工资，来电求助，全部工资20万左右，要求山东省建工集团尽快发放工资。（通话中来电人表示在建工集团门口，如在不解决将去市政府。要求必须发放工资）  希望相关单位落实处理，请处理并回复来电人。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={c4435b2a-c113-4aba-92bb-8fa4cd6501fc}&amp;IsZDDB=&amp;\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tstyle=\"color:#FF0000;\">李先生来电反映：3月15日左右到槐荫区青岛路与顺安路山东省建工集团工作，应4月21日发放工资，至今未发放工资，来电求助，全部工资20万左右，要求山东省建工集团尽快发放工资。（通话中来电人表示在建工集团门口，如在不解决将去市政府。要求必须发放工资）\n" +
            "\t\t\t\t\t\t\t\t\t\t\t希望相关单位落实处理，请处理并回复来电人。智慧泉城</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={c4435b2a-c113-4aba-92bb-8fa4cd6501fc}&amp;IsZDDB=&amp;\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tstyle=\"color:#FF0000;\">不保密</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={c4435b2a-c113-4aba-92bb-8fa4cd6501fc}&amp;IsZDDB=&amp;\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tstyle=\"color:#FF0000;\">需回复</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={c4435b2a-c113-4aba-92bb-8fa4cd6501fc}&amp;IsZDDB=&amp;\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tstyle=\"color:#FF0000;\">槐荫区政府热线办理</a></td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridEvenRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={d24f4a96-2230-4eb9-9f32-3944ff069dcd}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200508141232953208\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d24f4a96-2230-4eb9-9f32-3944ff069dcd}&amp;IsZDDB=&amp;\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tstyle=\"color:#FF0000;\">200508141232953208</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"紧急\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d24f4a96-2230-4eb9-9f32-3944ff069dcd}&amp;IsZDDB=&amp;\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tstyle=\"color:#FF0000;\">紧急</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-11\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d24f4a96-2230-4eb9-9f32-3944ff069dcd}&amp;IsZDDB=&amp;\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tstyle=\"color:#FF0000;\">2020-05-11</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 15:13:14\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d24f4a96-2230-4eb9-9f32-3944ff069dcd}&amp;IsZDDB=&amp;\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tstyle=\"color:#FF0000;\">2020/5/8 15:13:14</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"110-1218号转接汪先生反映：槐荫区王府庄高铁修配站工作，拖欠5个人1个月工资共3万元（有签订合同）中铁四局，负责人孟路（手机号不能提供）（通话中不解决就自己往上级反映）。 希望相关单位落实处理，请处理并回复来电人。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d24f4a96-2230-4eb9-9f32-3944ff069dcd}&amp;IsZDDB=&amp;\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tstyle=\"color:#FF0000;\">110-1218号转接汪先生反映：槐荫区王府庄高铁修配站工作，拖欠5个人1个月工资共3万元（有签订合同）中铁四局，负责人孟路（手机号不能提供）（通话中不解决就自己往上级反映）。\n" +
            "\t\t\t\t\t\t\t\t\t\t\t希望相关单位落实处理，请处理并回复来电人。智慧泉城</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d24f4a96-2230-4eb9-9f32-3944ff069dcd}&amp;IsZDDB=&amp;\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tstyle=\"color:#FF0000;\">不保密</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d24f4a96-2230-4eb9-9f32-3944ff069dcd}&amp;IsZDDB=&amp;\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tstyle=\"color:#FF0000;\">需回复</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d24f4a96-2230-4eb9-9f32-3944ff069dcd}&amp;IsZDDB=&amp;\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tstyle=\"color:#FF0000;\">槐荫区政府热线办理</a></td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridOddRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={793d200f-930a-4aa2-915b-ec03d54ea356}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200428105448937512\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={793d200f-930a-4aa2-915b-ec03d54ea356}&amp;IsZDDB=&amp;\">200428105448937512</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={793d200f-930a-4aa2-915b-ec03d54ea356}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={793d200f-930a-4aa2-915b-ec03d54ea356}&amp;IsZDDB=&amp;\">2020-05-13</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 15:10:02\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={793d200f-930a-4aa2-915b-ec03d54ea356}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t15:10:02</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"盛廷利先生来电反映：自己是槐荫区张庄路前屯小区西门尚足行天下的采耳师，单位拖欠1个月工资至今未发放，总计3900元，2月17日已经通过网上申请劳动仲裁，但至今一直没有开庭审理自己的问题，对此不满，要求落实自己的案件进展，希望相关单位落实处理，请处理并回复来电人。\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={793d200f-930a-4aa2-915b-ec03d54ea356}&amp;IsZDDB=&amp;\">盛廷利先生来电反映：自己是槐荫区张庄路前屯小区西门尚足行天下的采耳师，单位拖欠1个月工资至今未发放，总计3900元，2月17日已经通过网上申请劳动仲裁，但至今一直没有开庭审理自己的问题，对此不满，要求落实自己的案件进展，希望相关单位落实处理，请处理并回复来电人。</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={793d200f-930a-4aa2-915b-ec03d54ea356}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={793d200f-930a-4aa2-915b-ec03d54ea356}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={793d200f-930a-4aa2-915b-ec03d54ea356}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridEvenRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={438100ad-91c5-44e6-adb3-7b7b8e719db6}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200508143458641249\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={438100ad-91c5-44e6-adb3-7b7b8e719db6}&amp;IsZDDB=&amp;\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tstyle=\"color:#FF0000;\">200508143458641249</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"紧急\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={438100ad-91c5-44e6-adb3-7b7b8e719db6}&amp;IsZDDB=&amp;\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tstyle=\"color:#FF0000;\">紧急</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-11\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={438100ad-91c5-44e6-adb3-7b7b8e719db6}&amp;IsZDDB=&amp;\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tstyle=\"color:#FF0000;\">2020-05-11</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 15:10:00\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={438100ad-91c5-44e6-adb3-7b7b8e719db6}&amp;IsZDDB=&amp;\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tstyle=\"color:#FF0000;\">2020/5/8 15:10:00</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"匿名先生来电反映：槐荫区王府庄高铁修配站工作，拖欠5个人1个月工资共3万元（有签订合同）中铁四局，负责人孟路（手机号不能提供）（通话中不解决就上访、必须1个小时给予回复）。希望相关单位落实处理，请处理并回复来电人。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={438100ad-91c5-44e6-adb3-7b7b8e719db6}&amp;IsZDDB=&amp;\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tstyle=\"color:#FF0000;\">匿名先生来电反映：槐荫区王府庄高铁修配站工作，拖欠5个人1个月工资共3万元（有签订合同）中铁四局，负责人孟路（手机号不能提供）（通话中不解决就上访、必须1个小时给予回复）。希望相关单位落实处理，请处理并回复来电人。智慧泉城</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={438100ad-91c5-44e6-adb3-7b7b8e719db6}&amp;IsZDDB=&amp;\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tstyle=\"color:#FF0000;\">不保密</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={438100ad-91c5-44e6-adb3-7b7b8e719db6}&amp;IsZDDB=&amp;\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tstyle=\"color:#FF0000;\">需回复</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={438100ad-91c5-44e6-adb3-7b7b8e719db6}&amp;IsZDDB=&amp;\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\tstyle=\"color:#FF0000;\">槐荫区政府热线办理</a></td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridOddRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={733cf8e9-46ef-478d-9a25-332556c09739}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200507154608322371\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={733cf8e9-46ef-478d-9a25-332556c09739}&amp;IsZDDB=&amp;\">200507154608322371</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={733cf8e9-46ef-478d-9a25-332556c09739}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={733cf8e9-46ef-478d-9a25-332556c09739}&amp;IsZDDB=&amp;\">2020-05-13</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 15:09:13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={733cf8e9-46ef-478d-9a25-332556c09739}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t15:09:13</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"刘女士来电反映：槐荫区吴家堡街道办事处居民，咨询未缴纳任何养老保险的村民是否可以一次性缴纳养老保险，，到达退休年龄后领取养老金，希望相关单位落实处理，请处理并回复来电人。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={733cf8e9-46ef-478d-9a25-332556c09739}&amp;IsZDDB=&amp;\">刘女士来电反映：槐荫区吴家堡街道办事处居民，咨询未缴纳任何养老保险的村民是否可以一次性缴纳养老保险，，到达退休年龄后领取养老金，希望相关单位落实处理，请处理并回复来电人。智慧泉城</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={733cf8e9-46ef-478d-9a25-332556c09739}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={733cf8e9-46ef-478d-9a25-332556c09739}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={733cf8e9-46ef-478d-9a25-332556c09739}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridEvenRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={4d4f030b-55ba-4391-978f-5576734f5b70}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200508145458959400\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={4d4f030b-55ba-4391-978f-5576734f5b70}&amp;IsZDDB=&amp;\">200508145458959400</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={4d4f030b-55ba-4391-978f-5576734f5b70}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={4d4f030b-55ba-4391-978f-5576734f5b70}&amp;IsZDDB=&amp;\">2020-05-13</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 15:07:26\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={4d4f030b-55ba-4391-978f-5576734f5b70}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t15:07:26</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"王女士来电反映：2019年10月份至2020年2月29日在槐荫区西城西进时代中心B座302室济南尚上策新媒体有限公司上班，公司拖欠2000元左右的工资没有发放，对此不满，希望相关单位协调公司发放工资，  希望相关单位落实处理，请处理并回复来电人。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={4d4f030b-55ba-4391-978f-5576734f5b70}&amp;IsZDDB=&amp;\">王女士来电反映：2019年10月份至2020年2月29日在槐荫区西城西进时代中心B座302室济南尚上策新媒体有限公司上班，公司拖欠2000元左右的工资没有发放，对此不满，希望相关单位协调公司发放工资，\n" +
            "\t\t\t\t\t\t\t\t\t\t\t希望相关单位落实处理，请处理并回复来电人。智慧泉城</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={4d4f030b-55ba-4391-978f-5576734f5b70}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={4d4f030b-55ba-4391-978f-5576734f5b70}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={4d4f030b-55ba-4391-978f-5576734f5b70}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridOddRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={d9886c3e-2ee2-4c73-bac6-09e83f09a354}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200508145212759125\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d9886c3e-2ee2-4c73-bac6-09e83f09a354}&amp;IsZDDB=&amp;\">200508145212759125</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d9886c3e-2ee2-4c73-bac6-09e83f09a354}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d9886c3e-2ee2-4c73-bac6-09e83f09a354}&amp;IsZDDB=&amp;\">2020-05-13</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 15:07:07\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d9886c3e-2ee2-4c73-bac6-09e83f09a354}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t15:07:07</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"李先生来电反映：2018年10月在槐荫区西客站绿地缤纷城1008室德州金辰房地产开发有限公司济南办事处工作，签订劳动合同，现公司以撤销济南办事处为由让自己到德州工作，并且不接听自己电话，对此不满，来电求助协调公司进行面谈，希望相关单位落实处理，请处理并回复来电人。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d9886c3e-2ee2-4c73-bac6-09e83f09a354}&amp;IsZDDB=&amp;\">李先生来电反映：2018年10月在槐荫区西客站绿地缤纷城1008室德州金辰房地产开发有限公司济南办事处工作，签订劳动合同，现公司以撤销济南办事处为由让自己到德州工作，并且不接听自己电话，对此不满，来电求助协调公司进行面谈，希望相关单位落实处理，请处理并回复来电人。智慧泉城</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d9886c3e-2ee2-4c73-bac6-09e83f09a354}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d9886c3e-2ee2-4c73-bac6-09e83f09a354}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d9886c3e-2ee2-4c73-bac6-09e83f09a354}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridEvenRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={1140659d-5b10-4989-b9e1-37d64f838a5f}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200508142939227108\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={1140659d-5b10-4989-b9e1-37d64f838a5f}&amp;IsZDDB=&amp;\">200508142939227108</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={1140659d-5b10-4989-b9e1-37d64f838a5f}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={1140659d-5b10-4989-b9e1-37d64f838a5f}&amp;IsZDDB=&amp;\">2020-05-13</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 14:52:50\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={1140659d-5b10-4989-b9e1-37d64f838a5f}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t14:52:50</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"秦先生来电反映：自己2018年在槐荫区济南西站兴乐家园小区进行了清理卫生工作，现在拖欠自己尾款2万多元没有支付，认为不合理，希望落实给予追讨，  希望相关单位落实处理，请处理并回复来电人。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={1140659d-5b10-4989-b9e1-37d64f838a5f}&amp;IsZDDB=&amp;\">秦先生来电反映：自己2018年在槐荫区济南西站兴乐家园小区进行了清理卫生工作，现在拖欠自己尾款2万多元没有支付，认为不合理，希望落实给予追讨，\n" +
            "\t\t\t\t\t\t\t\t\t\t\t希望相关单位落实处理，请处理并回复来电人。智慧泉城</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={1140659d-5b10-4989-b9e1-37d64f838a5f}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={1140659d-5b10-4989-b9e1-37d64f838a5f}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={1140659d-5b10-4989-b9e1-37d64f838a5f}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridOddRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={ff62d99d-bcf6-4321-a771-d71dfca9db5e}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200508133923355859\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={ff62d99d-bcf6-4321-a771-d71dfca9db5e}&amp;IsZDDB=&amp;\">200508133923355859</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={ff62d99d-bcf6-4321-a771-d71dfca9db5e}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={ff62d99d-bcf6-4321-a771-d71dfca9db5e}&amp;IsZDDB=&amp;\">2020-05-13</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 14:47:23\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={ff62d99d-bcf6-4321-a771-d71dfca9db5e}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t14:47:23</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"仇保国先生来电反映：自己在槐荫区阳光100小区G区济南帕克美式英语培训机构上班，单位拖欠自己2016年的工资没有发放，大约1万元。要求协调进行发放工资。希望相关部门落实处理，请处理并回复来电人。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={ff62d99d-bcf6-4321-a771-d71dfca9db5e}&amp;IsZDDB=&amp;\">仇保国先生来电反映：自己在槐荫区阳光100小区G区济南帕克美式英语培训机构上班，单位拖欠自己2016年的工资没有发放，大约1万元。要求协调进行发放工资。希望相关部门落实处理，请处理并回复来电人。智慧泉城</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={ff62d99d-bcf6-4321-a771-d71dfca9db5e}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={ff62d99d-bcf6-4321-a771-d71dfca9db5e}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={ff62d99d-bcf6-4321-a771-d71dfca9db5e}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridEvenRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={49082b8c-2771-4893-bab3-b5f3748dfe6e}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200508141927569307\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={49082b8c-2771-4893-bab3-b5f3748dfe6e}&amp;IsZDDB=&amp;\">200508141927569307</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={49082b8c-2771-4893-bab3-b5f3748dfe6e}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={49082b8c-2771-4893-bab3-b5f3748dfe6e}&amp;IsZDDB=&amp;\">2020-05-13</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 14:44:05\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={49082b8c-2771-4893-bab3-b5f3748dfe6e}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t14:44:05</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"张先生来电反映：2019年8月在槐荫区经三纬七路嗨皮杨火锅店工作，但是工资700元至今未发放，要求尽快发现放。慧泉城希望相关单位落实处理，请处理并回复来电人。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={49082b8c-2771-4893-bab3-b5f3748dfe6e}&amp;IsZDDB=&amp;\">张先生来电反映：2019年8月在槐荫区经三纬七路嗨皮杨火锅店工作，但是工资700元至今未发放，要求尽快发现放。慧泉城希望相关单位落实处理，请处理并回复来电人。智慧泉城</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={49082b8c-2771-4893-bab3-b5f3748dfe6e}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={49082b8c-2771-4893-bab3-b5f3748dfe6e}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={49082b8c-2771-4893-bab3-b5f3748dfe6e}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridOddRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={c7d26dd4-0384-4e06-8a8f-c949d390433e}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200428085340023978\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={c7d26dd4-0384-4e06-8a8f-c949d390433e}&amp;IsZDDB=&amp;\">200428085340023978</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={c7d26dd4-0384-4e06-8a8f-c949d390433e}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={c7d26dd4-0384-4e06-8a8f-c949d390433e}&amp;IsZDDB=&amp;\">2020-05-13</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 14:12:47\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={c7d26dd4-0384-4e06-8a8f-c949d390433e}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t14:12:47</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"王锋来电反映：在河北廊坊广阳运送货物到济南220省道106医院附近路段，商家不给结算运费。商家：槐荫区齐州路2066号善信大厦东塔1508室，正川装饰有限公司。葛建国：13145311777，希望部门协调尽快转运费1800元。希望相关单位落实处理，请处理并回复来电人。\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={c7d26dd4-0384-4e06-8a8f-c949d390433e}&amp;IsZDDB=&amp;\">王锋来电反映：在河北廊坊广阳运送货物到济南220省道106医院附近路段，商家不给结算运费。商家：槐荫区齐州路2066号善信大厦东塔1508室，正川装饰有限公司。葛建国：13145311777，希望部门协调尽快转运费1800元。希望相关单位落实处理，请处理并回复来电人。</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={c7d26dd4-0384-4e06-8a8f-c949d390433e}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={c7d26dd4-0384-4e06-8a8f-c949d390433e}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={c7d26dd4-0384-4e06-8a8f-c949d390433e}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridEvenRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={f093ad4a-2fe3-48de-8a65-d8550fc42351}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/org.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200505145435086114\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={f093ad4a-2fe3-48de-8a65-d8550fc42351}&amp;IsZDDB=&amp;\">200505145435086114</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={f093ad4a-2fe3-48de-8a65-d8550fc42351}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-09\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={f093ad4a-2fe3-48de-8a65-d8550fc42351}&amp;IsZDDB=&amp;\">2020-05-09</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 14:09:45\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={f093ad4a-2fe3-48de-8a65-d8550fc42351}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t14:09:45</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"曹先生来电反映：咨询2019年退休，槐荫区退休职工独生子女补助标准是多少。希望相关单位落实处理，请处理并回复来电人。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={f093ad4a-2fe3-48de-8a65-d8550fc42351}&amp;IsZDDB=&amp;\">曹先生来电反映：咨询2019年退休，槐荫区退休职工独生子女补助标准是多少。希望相关单位落实处理，请处理并回复来电人。智慧泉城</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={f093ad4a-2fe3-48de-8a65-d8550fc42351}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={f093ad4a-2fe3-48de-8a65-d8550fc42351}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={f093ad4a-2fe3-48de-8a65-d8550fc42351}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridOddRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={d7864c9a-24d4-460f-992a-285499afde7c}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200428115325736176\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d7864c9a-24d4-460f-992a-285499afde7c}&amp;IsZDDB=&amp;\">200428115325736176</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d7864c9a-24d4-460f-992a-285499afde7c}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d7864c9a-24d4-460f-992a-285499afde7c}&amp;IsZDDB=&amp;\">2020-05-13</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 14:03:51\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d7864c9a-24d4-460f-992a-285499afde7c}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t14:03:51</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"张先生来电反映：前期在槐荫区和谐广场15楼三千茶农工作，2019年7月离职，期间拖欠自己绩效工资1500元左右，目前该店已经办到西客站印象济南，要求相关单位协调支付绩效工资，希望相关单位落实处理，请处理并回复来电人。\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d7864c9a-24d4-460f-992a-285499afde7c}&amp;IsZDDB=&amp;\">张先生来电反映：前期在槐荫区和谐广场15楼三千茶农工作，2019年7月离职，期间拖欠自己绩效工资1500元左右，目前该店已经办到西客站印象济南，要求相关单位协调支付绩效工资，希望相关单位落实处理，请处理并回复来电人。</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d7864c9a-24d4-460f-992a-285499afde7c}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d7864c9a-24d4-460f-992a-285499afde7c}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={d7864c9a-24d4-460f-992a-285499afde7c}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridEvenRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={e5dc7d99-cce8-417a-a0fd-6f6cc6fb3341}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200508115024770908\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={e5dc7d99-cce8-417a-a0fd-6f6cc6fb3341}&amp;IsZDDB=&amp;\">200508115024770908</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={e5dc7d99-cce8-417a-a0fd-6f6cc6fb3341}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={e5dc7d99-cce8-417a-a0fd-6f6cc6fb3341}&amp;IsZDDB=&amp;\">2020-05-13</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 14:02:04\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={e5dc7d99-cce8-417a-a0fd-6f6cc6fb3341}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t14:02:04</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"朱先生来电反映：2020年3月2日入职中良管理有限公司（地址：槐荫区绿地广场公司对过B座2402室，股东：王瑞峰）3月5日将自己安排到浙江杭州浙江财宏投资有限公司（法人：王瑞峰），承诺车票费用帮助报销，但实际没有，没有实质性工作，只让关注群信息，并且不断灌输心灵鸡汤，认为属于传销，4月28日返回济南，希望相关单位落实查处王瑞峰名下公司的营运状态是否正常，若不正常尽快督促其停止招聘，希望相关单位落实处理，请处理并回复来电人。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={e5dc7d99-cce8-417a-a0fd-6f6cc6fb3341}&amp;IsZDDB=&amp;\">朱先生来电反映：2020年3月2日入职中良管理有限公司（地址：槐荫区绿地广场公司对过B座2402室，股东：王瑞峰）3月5日将自己安排到浙江杭州浙江财宏投资有限公司（法人：王瑞峰），承诺车票费用帮助报销，但实际没有，没有实质性工作，只让关注群信息，并且不断灌输心灵鸡汤，认为属于传销，4月28日返回济南，希望相关单位落实查处王瑞峰名下公司的营运状态是否正常，若不正常尽快督促其停止招聘，希望相关单位落实处理，请处理并回复来电人。智慧泉城</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={e5dc7d99-cce8-417a-a0fd-6f6cc6fb3341}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={e5dc7d99-cce8-417a-a0fd-6f6cc6fb3341}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={e5dc7d99-cce8-417a-a0fd-6f6cc6fb3341}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridOddRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={bff53d49-98f2-4798-bd05-7ed3d2490c74}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200508134220709721\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={bff53d49-98f2-4798-bd05-7ed3d2490c74}&amp;IsZDDB=&amp;\">200508134220709721</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={bff53d49-98f2-4798-bd05-7ed3d2490c74}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={bff53d49-98f2-4798-bd05-7ed3d2490c74}&amp;IsZDDB=&amp;\">2020-05-13</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 14:01:56\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={bff53d49-98f2-4798-bd05-7ed3d2490c74}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t14:01:56</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"刘女士来电反映：自己配偶在槐荫区兴福街道办缴纳灵活就业人员社保，已满50周岁，现配偶丧失劳动能力，要求相关部门给予办理病退。（刘金勇370111197003293954）希望相关单位落实处理，请处理并回复来电人。  智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={bff53d49-98f2-4798-bd05-7ed3d2490c74}&amp;IsZDDB=&amp;\">刘女士来电反映：自己配偶在槐荫区兴福街道办缴纳灵活就业人员社保，已满50周岁，现配偶丧失劳动能力，要求相关部门给予办理病退。（刘金勇370111197003293954）希望相关单位落实处理，请处理并回复来电人。\n" +
            "\t\t\t\t\t\t\t\t\t\t\t智慧泉城</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={bff53d49-98f2-4798-bd05-7ed3d2490c74}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={bff53d49-98f2-4798-bd05-7ed3d2490c74}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={bff53d49-98f2-4798-bd05-7ed3d2490c74}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridEvenRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={c74888ab-eef0-46e7-a117-ad4540c3f9e1}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200508124815748991\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={c74888ab-eef0-46e7-a117-ad4540c3f9e1}&amp;IsZDDB=&amp;\">200508124815748991</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={c74888ab-eef0-46e7-a117-ad4540c3f9e1}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={c74888ab-eef0-46e7-a117-ad4540c3f9e1}&amp;IsZDDB=&amp;\">2020-05-13</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 13:58:48\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={c74888ab-eef0-46e7-a117-ad4540c3f9e1}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t13:58:48</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"张先生来电反映：来电人孩子在槐荫区中国建筑第八工程局城建山东第一医科大学济南主校区项目，工作中脸上被刮伤20多公分，但是工地告知：只负责治疗的费用，不负责后期脸部修复的费用，让来电人打官司，判决多少钱，对方在拿多少，来电人不想使用法律途径，希望相关单位进行处理，帮助索要钱款，希望相关单位落实处理，请处理并回复来电人。  智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={c74888ab-eef0-46e7-a117-ad4540c3f9e1}&amp;IsZDDB=&amp;\">张先生来电反映：来电人孩子在槐荫区中国建筑第八工程局城建山东第一医科大学济南主校区项目，工作中脸上被刮伤20多公分，但是工地告知：只负责治疗的费用，不负责后期脸部修复的费用，让来电人打官司，判决多少钱，对方在拿多少，来电人不想使用法律途径，希望相关单位进行处理，帮助索要钱款，希望相关单位落实处理，请处理并回复来电人。\n" +
            "\t\t\t\t\t\t\t\t\t\t\t智慧泉城</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={c74888ab-eef0-46e7-a117-ad4540c3f9e1}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={c74888ab-eef0-46e7-a117-ad4540c3f9e1}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={c74888ab-eef0-46e7-a117-ad4540c3f9e1}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridOddRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={951069a6-6d9a-4577-a7d5-423e31ad75dc}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200508120658890594\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={951069a6-6d9a-4577-a7d5-423e31ad75dc}&amp;IsZDDB=&amp;\">200508120658890594</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={951069a6-6d9a-4577-a7d5-423e31ad75dc}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={951069a6-6d9a-4577-a7d5-423e31ad75dc}&amp;IsZDDB=&amp;\">2020-05-13</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 13:48:07\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={951069a6-6d9a-4577-a7d5-423e31ad75dc}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t13:48:07</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"郑女士来电反映：4月17日自己去槐荫区劳动监察大队举报槐荫区西城大厦1104室环保工程有限公司拖欠1月份工资及在疫情期间辞退自己的事情，至今没有办理结果，多次联系槐荫区劳动监察大队电话但是无人接听，要求告知办理结果。（152631199301050929）希望相关单位落实处理，请处理并回复来电人。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={951069a6-6d9a-4577-a7d5-423e31ad75dc}&amp;IsZDDB=&amp;\">郑女士来电反映：4月17日自己去槐荫区劳动监察大队举报槐荫区西城大厦1104室环保工程有限公司拖欠1月份工资及在疫情期间辞退自己的事情，至今没有办理结果，多次联系槐荫区劳动监察大队电话但是无人接听，要求告知办理结果。（152631199301050929）希望相关单位落实处理，请处理并回复来电人。智慧泉城</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={951069a6-6d9a-4577-a7d5-423e31ad75dc}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={951069a6-6d9a-4577-a7d5-423e31ad75dc}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={951069a6-6d9a-4577-a7d5-423e31ad75dc}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridEvenRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={9b8a924e-fc28-4733-bef4-30e17d6326ed}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200508112719983710\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={9b8a924e-fc28-4733-bef4-30e17d6326ed}&amp;IsZDDB=&amp;\">200508112719983710</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={9b8a924e-fc28-4733-bef4-30e17d6326ed}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={9b8a924e-fc28-4733-bef4-30e17d6326ed}&amp;IsZDDB=&amp;\">2020-05-13</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 13:33:16\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={9b8a924e-fc28-4733-bef4-30e17d6326ed}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t13:33:16</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"朱先生来电反映：2020年3月2日入职中良管理有限公司（地址：槐荫区绿地广场公司对过B座2402室，股东：王瑞峰）3月5日将自己安排到浙江杭州浙江财宏投资有限公司（法人：王瑞峰），承诺车票费用帮助报销，但实际没有，没有实质性工作，只让关注群信息，并且不断灌输心灵鸡汤，认为属于传销，4月28日回到济南，希望相关单位督促尽快给自己发放工资并报销路费，希望相关单位落实处理，请处理并回复来电人。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={9b8a924e-fc28-4733-bef4-30e17d6326ed}&amp;IsZDDB=&amp;\">朱先生来电反映：2020年3月2日入职中良管理有限公司（地址：槐荫区绿地广场公司对过B座2402室，股东：王瑞峰）3月5日将自己安排到浙江杭州浙江财宏投资有限公司（法人：王瑞峰），承诺车票费用帮助报销，但实际没有，没有实质性工作，只让关注群信息，并且不断灌输心灵鸡汤，认为属于传销，4月28日回到济南，希望相关单位督促尽快给自己发放工资并报销路费，希望相关单位落实处理，请处理并回复来电人。智慧泉城</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={9b8a924e-fc28-4733-bef4-30e17d6326ed}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={9b8a924e-fc28-4733-bef4-30e17d6326ed}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={9b8a924e-fc28-4733-bef4-30e17d6326ed}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridOddRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={529e4a19-9fd3-43b3-be16-c3a774f869bf}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200508123301344003\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={529e4a19-9fd3-43b3-be16-c3a774f869bf}&amp;IsZDDB=&amp;\">200508123301344003</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={529e4a19-9fd3-43b3-be16-c3a774f869bf}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={529e4a19-9fd3-43b3-be16-c3a774f869bf}&amp;IsZDDB=&amp;\">2020-05-13</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 13:30:01\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={529e4a19-9fd3-43b3-be16-c3a774f869bf}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t13:30:01</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"付建东先生来电反映：之前槐荫区济南和兴汽车服务有限公司（公司地址：济南市槐荫区刘长山路绿地国际花都）从事司机工作，无合同，负责人：刘涛（无法提供联系方式），车队队长：冯家建，手机号：13258053031，自2019年9月20日至今工资10000多元未发放，要求尽快发放， 希望相关单位落实处理，请处理并回复来电人。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={529e4a19-9fd3-43b3-be16-c3a774f869bf}&amp;IsZDDB=&amp;\">付建东先生来电反映：之前槐荫区济南和兴汽车服务有限公司（公司地址：济南市槐荫区刘长山路绿地国际花都）从事司机工作，无合同，负责人：刘涛（无法提供联系方式），车队队长：冯家建，手机号：13258053031，自2019年9月20日至今工资10000多元未发放，要求尽快发放，\n" +
            "\t\t\t\t\t\t\t\t\t\t\t希望相关单位落实处理，请处理并回复来电人。智慧泉城</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={529e4a19-9fd3-43b3-be16-c3a774f869bf}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={529e4a19-9fd3-43b3-be16-c3a774f869bf}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={529e4a19-9fd3-43b3-be16-c3a774f869bf}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridEvenRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={b952e965-9a0c-4e0d-ba22-024c3ac7eeed}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200508120843283981\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={b952e965-9a0c-4e0d-ba22-024c3ac7eeed}&amp;IsZDDB=&amp;\">200508120843283981</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={b952e965-9a0c-4e0d-ba22-024c3ac7eeed}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={b952e965-9a0c-4e0d-ba22-024c3ac7eeed}&amp;IsZDDB=&amp;\">2020-05-13</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 13:26:58\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={b952e965-9a0c-4e0d-ba22-024c3ac7eeed}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t13:26:58</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"米女士来电反映：2019年11月份开始到槐荫区兴福街道印象济南店悦宝园早教培训机构从事早教工作，预定实习期为三个月，一直未缴纳疫情期间的社保、未发放工资，认为不合理，要求尽快发放工资。希望相关单位落实处理，请处理并回复来电人。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={b952e965-9a0c-4e0d-ba22-024c3ac7eeed}&amp;IsZDDB=&amp;\">米女士来电反映：2019年11月份开始到槐荫区兴福街道印象济南店悦宝园早教培训机构从事早教工作，预定实习期为三个月，一直未缴纳疫情期间的社保、未发放工资，认为不合理，要求尽快发放工资。希望相关单位落实处理，请处理并回复来电人。智慧泉城</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={b952e965-9a0c-4e0d-ba22-024c3ac7eeed}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={b952e965-9a0c-4e0d-ba22-024c3ac7eeed}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={b952e965-9a0c-4e0d-ba22-024c3ac7eeed}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridOddRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={85fe37b2-f6a7-4e71-9c6e-0ac9884fc59a}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200508120447945751\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={85fe37b2-f6a7-4e71-9c6e-0ac9884fc59a}&amp;IsZDDB=&amp;\">200508120447945751</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={85fe37b2-f6a7-4e71-9c6e-0ac9884fc59a}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={85fe37b2-f6a7-4e71-9c6e-0ac9884fc59a}&amp;IsZDDB=&amp;\">2020-05-13</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 13:25:00\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={85fe37b2-f6a7-4e71-9c6e-0ac9884fc59a}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t13:25:00</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"周女士来电反映：老人是槐荫区户籍，没有参加任何居民养老保险和职工养老保险，咨询年满60周岁之后能否一次性补缴后领取养老金， （已按知识库解释，来电人不认可）希望相关单位落实处理，请处理并回复来电人。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={85fe37b2-f6a7-4e71-9c6e-0ac9884fc59a}&amp;IsZDDB=&amp;\">周女士来电反映：老人是槐荫区户籍，没有参加任何居民养老保险和职工养老保险，咨询年满60周岁之后能否一次性补缴后领取养老金，\n" +
            "\t\t\t\t\t\t\t\t\t\t\t（已按知识库解释，来电人不认可）希望相关单位落实处理，请处理并回复来电人。智慧泉城</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={85fe37b2-f6a7-4e71-9c6e-0ac9884fc59a}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={85fe37b2-f6a7-4e71-9c6e-0ac9884fc59a}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={85fe37b2-f6a7-4e71-9c6e-0ac9884fc59a}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridEvenRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={a814c93e-bcfc-4cb7-b2ec-3de26ee201a0}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200508115133244368\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={a814c93e-bcfc-4cb7-b2ec-3de26ee201a0}&amp;IsZDDB=&amp;\">200508115133244368</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={a814c93e-bcfc-4cb7-b2ec-3de26ee201a0}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={a814c93e-bcfc-4cb7-b2ec-3de26ee201a0}&amp;IsZDDB=&amp;\">2020-05-13</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 13:24:03\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={a814c93e-bcfc-4cb7-b2ec-3de26ee201a0}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t13:24:03</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"来电人反映：槐荫区美里路海纳城555号新兖医药有限公司，现拖欠所有员工1月份-5月份工资未发放，联系老板时，一直未解决，对此不满，要求尽快发放工资。慧泉城希望相关单位落实处理，请处理。智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={a814c93e-bcfc-4cb7-b2ec-3de26ee201a0}&amp;IsZDDB=&amp;\">来电人反映：槐荫区美里路海纳城555号新兖医药有限公司，现拖欠所有员工1月份-5月份工资未发放，联系老板时，一直未解决，对此不满，要求尽快发放工资。慧泉城希望相关单位落实处理，请处理。智慧泉城</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={a814c93e-bcfc-4cb7-b2ec-3de26ee201a0}&amp;IsZDDB=&amp;\">保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={a814c93e-bcfc-4cb7-b2ec-3de26ee201a0}&amp;IsZDDB=&amp;\">不需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={a814c93e-bcfc-4cb7-b2ec-3de26ee201a0}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr class=\"gridOddRow\" onmouseover=\"doColor(this,this.sectionRowIndex)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"undoColor(this,this.sectionRowIndex)\">\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<input type='checkbox' name='check_uncheck_This' value='GUID={e690039e-6ff9-41ee-8900-8021839f34a4}èIsZDDB='></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t<img align=\"absbottom\" src=\"../images/blue.jpg\" style=\"border-width:0px;\" />&nbsp;<a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"200508114400217730\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={e690039e-6ff9-41ee-8900-8021839f34a4}&amp;IsZDDB=&amp;\">200508114400217730</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a title=\"一般\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={e690039e-6ff9-41ee-8900-8021839f34a4}&amp;IsZDDB=&amp;\">一般</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020-05-13\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={e690039e-6ff9-41ee-8900-8021839f34a4}&amp;IsZDDB=&amp;\">2020-05-13</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"2020/5/8 13:22:55\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={e690039e-6ff9-41ee-8900-8021839f34a4}&amp;IsZDDB=&amp;\">2020/5/8\n" +
            "\t\t\t\t\t\t\t\t\t\t\t13:22:55</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"程女士来电反映：单位位于槐荫区，现有员工一直在请假，咨询根据规定工资应如何计发，是否需要给予支付济南市最低工资，希望相关单位落实处理，请处理并回复来电人。  智慧泉城\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={e690039e-6ff9-41ee-8900-8021839f34a4}&amp;IsZDDB=&amp;\">程女士来电反映：单位位于槐荫区，现有员工一直在请假，咨询根据规定工资应如何计发，是否需要给予支付济南市最低工资，希望相关单位落实处理，请处理并回复来电人。\n" +
            "\t\t\t\t\t\t\t\t\t\t\t智慧泉城</a></td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"不保密\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={e690039e-6ff9-41ee-8900-8021839f34a4}&amp;IsZDDB=&amp;\">不保密</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"需回复\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={e690039e-6ff9-41ee-8900-8021839f34a4}&amp;IsZDDB=&amp;\">需回复</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t\t<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\"><a\n" +
            "\t\t\t\t\t\t\t\t\t\t\ttitle=\"槐荫区政府热线办理\"\n" +
            "\t\t\t\t\t\t\t\t\t\t\thref=\"ViewTaskHotLine.aspx?GUID={e690039e-6ff9-41ee-8900-8021839f34a4}&amp;IsZDDB=&amp;\">槐荫区政府热线办理</a>\n" +
            "\t\t\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t\t<tr style=\"background-color:#C6C6C6;height:18px;display:none;\">\n" +
            "\t\t\t\t\t\t\t\t\t<td colspan=\"9\" style=\"border-style:None;\"></td>\n" +
            "\t\t\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t\t\t</tbody>\n" +
            "\t\t\t\t\t\t</table>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t<table id=\"lkocok_grid_footer\" height='26px' bgcolor=\"c7e2ea\" width='100%' cellPadding='0'\n" +
            "\t\t\t\t\t\tcellspacing='0' border='0'>\n" +
            "\t\t\t\t\t\t<tr>\n" +
            "\t\t\t\t\t\t\t<td width='40%'>&nbsp;<img src='../images/find.gif' border='0' align='absmiddle'>\n" +
            "\t\t\t\t\t\t\t\t<font style='color:#386427'>总条目:<b>173</b>； 页次:</font>\n" +
            "\t\t\t\t\t\t\t\t<font style='color:#FF6600'><b>1</b></font>\n" +
            "\t\t\t\t\t\t\t\t<font style='color:#386427'><b>/5</b></font>\n" +
            "\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t\t<td width='60%' align='right'><a OnClick='return addSort2Pager(this)'\n" +
            "\t\t\t\t\t\t\t\t\thref=\"?pageNo=2\">下一页&nbsp;</a><select id='cmbPageNo' name='cmbPageNo' OnChange=\"cmbPager(this);\"><option value='1' selected>第1页</option><option value='2'>第2页</option><option value='3'>第3页</option><option value='4'>第4页</option><option value='5'>第5页</option></select>&nbsp;&nbsp;&nbsp;\n" +
            "\t\t\t\t\t\t\t</td>\n" +
            "\t\t\t\t\t\t</tr>\n" +
            "\t\t\t\t\t</table>\n" +
            "\t\t\t\t</DIV>\n" +
            "\t\t\t\t<input name=\"fenleiXmlStringHidden\" type=\"hidden\" id=\"fenleiXmlStringHidden\" value=\"&lt;?xml version=&quot;1.0&quot;?>&lt;root>&lt;que text='城市综合' code='1'>&lt;que text='交通运输' code='101'>&lt;que text='交通设施' code='10101'>&lt;que text='信号灯' code='1010101'>&lt;/que>&lt;que text='护栏' code='1010102'>&lt;/que>&lt;que text='隔离设施' code='1010103'>&lt;/que>&lt;que text='限高杆' code='1010104'>&lt;/que>&lt;que text='减速带' code='1010105'>&lt;/que>&lt;que text='停车管理' code='1010106'>&lt;/que>&lt;que text='交通指示标示' code='1010107'>&lt;/que>&lt;/que>&lt;que text='交通秩序' code='10102'>&lt;que text='违法停车' code='1010201'>&lt;/que>&lt;que text='交通堵塞' code='1010202'>&lt;/que>&lt;que text='交通事故' code='1010204'>&lt;/que>&lt;que text='闯信号灯' code='1010205'>&lt;/que>&lt;que text='停车场管理' code='1010206'>&lt;/que>&lt;/que>&lt;que text='机动车和驾驶员管理' code='10103'>&lt;que text='驾驶管理' code='1010301'>&lt;que text='驾驶证' code='101030101'>&lt;/que>&lt;que text='驾驶员培训' code='101030102'>&lt;/que>&lt;que text='驾校管理' code='101030103'>&lt;/que>&lt;/que>&lt;que text='机动车' code='1010302'>&lt;que text='机动车年审' code='101030201'>&lt;/que>&lt;que text='车辆改装' code='101030202'>&lt;/que>&lt;que text='环保标志' code='101030203'>&lt;/que>&lt;/que>&lt;/que>&lt;que text='公交运营' code='10104'>&lt;que text='公交线路' code='1010401'>&lt;que text='咨询线路' code='101040101'>&lt;/que>&lt;que text='增开线路' code='101040102'>&lt;/que>&lt;que text='公交班次' code='101040103'>&lt;/que>&lt;que text='乘车卡' code='101040104'>&lt;/que>&lt;que text='公交设施' code='101040105'>&lt;/que>&lt;que text='车载广告' code='101040106'>&lt;/que>&lt;que text='规划停车场' code='101040107'>&lt;/que>&lt;que text='安保人员' code='101040108'>&lt;/que>&lt;/que>&lt;que text='服务态度' code='1010402'>&lt;/que>&lt;que text='失物招领' code='1010403'>&lt;/que>&lt;/que>&lt;que text='出租管理' code='10105'>&lt;que text='服务态度' code='1010501'>&lt;que text='拒载' code='101050101'>&lt;/que>&lt;que text='绕路' code='101050102'>&lt;/que>&lt;que text='态度' code='101050103'>&lt;/que>&lt;que text='合乘' code='101050104'>&lt;/que>&lt;que text='行车安全' code='101050105'>&lt;/que>&lt;/que>&lt;que text='黑出租' code='1010502'>&lt;/que>&lt;que text='票款纠纷' code='1010503'>&lt;/que>&lt;que text='行业管理' code='1010504'>&lt;/que>&lt;que text='异地营运' code='1010505'>&lt;/que>&lt;que text='网约车' code='1010506'>&lt;/que>&lt;/que>&lt;que text='营运车辆管理' code='10106'>&lt;que text='证件办理' code='1010601'>&lt;/que>&lt;que text='票款纠纷' code='1010602'>&lt;/que>&lt;que text='货运纠纷' code='1010603'>&lt;/que>&lt;que text='行业管理' code='1010604'>&lt;/que>&lt;que text='超员超载' code='1010605'>&lt;/que>&lt;que text='城际公交' code='1010606'>&lt;/que>&lt;que text='长途客运' code='1010607'>&lt;/que>&lt;que text='违规行为' code='1010608'>&lt;/que>&lt;/que>&lt;que text='交通规费' code='10107'>&lt;que text='浮桥管理' code='1010701'>&lt;/que>&lt;que text='收费站管理' code='1010702'>&lt;/que>&lt;/que>&lt;que text='物流管理' code='10108'>&lt;/que>&lt;que text='铁路运输' code='10109'>&lt;que text='旅客购票' code='1010901'>&lt;/que>&lt;que text='规章解释' code='1010902'>&lt;/que>&lt;que text='服务态度' code='1010903'>&lt;/que>&lt;que text='服务设施' code='1010904'>&lt;/que>&lt;que text='站车经营' code='1010905'>&lt;/que>&lt;que text='民生民意' code='1010906'>&lt;/que>&lt;que text='治安环境' code='1010907'>&lt;/que>&lt;que text='其它' code='1010908'>&lt;/que>&lt;/que>&lt;que text='港航' code='10110'>&lt;que text='船员管理' code='1011001'>&lt;/que>&lt;que text='船舶管理' code='1011002'>&lt;/que>&lt;que text='浮桥管理' code='1011003'>&lt;/que>&lt;que text='栈桥' code='1011004'>&lt;/que>&lt;que text='跨河桥' code='1011005'>&lt;/que>&lt;/que>&lt;que text='公路路政' code='10111'>&lt;que text='国省道路况' code='1011101'>&lt;/que>&lt;que text='收费站管理' code='1011102'>&lt;/que>&lt;/que>&lt;que text='轨道交通' code='10112'>&lt;/que>&lt;/que>&lt;que text='城市管理' code='102'>&lt;que text='市容环境' code='10201'>&lt;que text='私搭乱建' code='1020101'>&lt;/que>&lt;que text='暴露垃圾' code='1020102'>&lt;/que>&lt;que text='道路不洁' code='1020103'>&lt;/que>&lt;que text='废弃家具设备' code='1020104'>&lt;/que>&lt;que text='焚烧垃圾树叶' code='1020105'>&lt;/que>&lt;que text='公共厕所' code='1020106'>&lt;/que>&lt;que text='旱厕清挖' code='1020107'>&lt;/que>&lt;que text='楼房化粪池清挖' code='1020108'>&lt;/que>&lt;que text='洒水降尘' code='1020109'>&lt;/que>&lt;que text='车辆清洗' code='1020110'>&lt;/que>&lt;que text='餐厨垃圾' code='1020111'>&lt;/que>&lt;que text='施工扰民' code='1020112'>&lt;que text='工地噪音' code='102011201'>&lt;/que>&lt;que text='混凝土浇灌' code='102011202'>&lt;/que>&lt;que text='车辆运输噪音' code='102011203'>&lt;/que>&lt;/que>&lt;que text='扬尘' code='1020113'>&lt;que text='工地施工扬尘' code='102011301'>&lt;/que>&lt;que text='道路施工扬尘' code='102011302'>&lt;/que>&lt;que text='工厂扬尘' code='102011303'>&lt;/que>&lt;/que>&lt;que text='施工废弃料' code='1020114'>&lt;/que>&lt;que text='施工占道' code='1020115'>&lt;/que>&lt;que text='占道经营游商' code='1020116'>&lt;/que>&lt;que text='店外经营' code='1020117'>&lt;/que>&lt;que text='占道废品收购' code='1020118'>&lt;/que>&lt;que text='乱堆物料' code='1020119'>&lt;/que>&lt;que text='沿街晾挂' code='1020120'>&lt;/que>&lt;que text='非法广告' code='1020121'>&lt;que text='非法小广告' code='102012101'>&lt;/que>&lt;que text='非法设置广告牌牌匾、灯箱' code='102012102'>&lt;/que>&lt;/que>&lt;que text='屋顶乱堆杂物' code='1020122'>&lt;/que>&lt;que text='擅自开门开窗' code='1020123'>&lt;/que>&lt;que text='渣土车' code='1020124'>&lt;que text='渣土车撒漏' code='102012401'>&lt;/que>&lt;que text='渣土车违规' code='102012402'>&lt;/que>&lt;que text='渣土车噪音' code='102012403'>&lt;/que>&lt;que text='渣土车倾倒' code='102012404'>&lt;/que>&lt;/que>&lt;que text='擅自设置垃圾存放点' code='1020125'>&lt;/que>&lt;que text='路面结冰' code='1020126'>&lt;/que>&lt;que text='环卫设施' code='1020127'>&lt;/que>&lt;que text='生活垃圾分类' code='1020128'>&lt;/que>&lt;que text='“三高”沿线整治' code='1020129'>&lt;/que>&lt;que text='违规饲养畜禽' code='1020130'>&lt;/que>&lt;que text='老旧小区综合整治' code='1020131'>&lt;/que>&lt;/que>&lt;que text='其它' code='10202'>&lt;/que>&lt;que text='景观灯' code='10203'>&lt;/que>&lt;que text='节能保温' code='10204'>&lt;/que>&lt;que text='建筑围挡' code='10205'>&lt;/que>&lt;que text='安全警示标志' code='10206'>&lt;/que>&lt;/que>&lt;que text='城管执法' code='103'>&lt;que text='市政工程' code='10301'>&lt;que text='道路不文明施工' code='1030101'>&lt;/que>&lt;que text='无证挖掘道路' code='1030102'>&lt;/que>&lt;que text='擅自占用城市道路' code='1030103'>&lt;/que>&lt;que text='擅自设立燃气存放站' code='1030104'>&lt;/que>&lt;/que>&lt;que text='绿化管理' code='10302'>&lt;que text='擅自砍伐树木' code='1030201'>&lt;/que>&lt;que text='破坏绿化带' code='1030202'>&lt;/que>&lt;que text='毁坏名泉' code='1030203'>&lt;/que>&lt;/que>&lt;que text='城市规划和人防' code='10303'>&lt;que text='违章违规建设' code='1030301'>&lt;/que>&lt;que text='改变建筑物使用性质' code='1030302'>&lt;/que>&lt;/que>&lt;que text='环境保护管理' code='10304'>&lt;que text='油烟扰民' code='1030401'>&lt;/que>&lt;que text='噪音扰民' code='1030402'>&lt;que text='夜间施工扰民' code='103040201'>&lt;/que>&lt;que text='商业噪音' code='103040202'>&lt;/que>&lt;que text='加工作业扰民' code='103040203'>&lt;/que>&lt;/que>&lt;/que>&lt;/que>&lt;que text='环境保护' code='104'>&lt;que text='大气污染' code='10401'>&lt;que text='燃煤污染' code='1040101'>&lt;/que>&lt;que text='工业排放' code='1040102'>&lt;/que>&lt;que text='汽车尾气' code='1040103'>&lt;/que>&lt;que text='清洁煤' code='1040104'>&lt;/que>&lt;que text='工业企业污染' code='1040105'>&lt;/que>&lt;que text='清洁能源' code='1040106'>&lt;/que>&lt;/que>&lt;que text='水污染' code='10402'>&lt;/que>&lt;que text='固废污染' code='10403'>&lt;/que>&lt;que text='噪声污染' code='10404'>&lt;/que>&lt;que text='辐射污染' code='10405'>&lt;/que>&lt;que text='环保执法' code='10406'>&lt;/que>&lt;que text='秸秆露天焚烧' code='10407'>&lt;/que>&lt;/que>&lt;que text='居民生活' code='105'>&lt;que text='电力' code='10501'>&lt;que text='停电' code='1050101'>&lt;/que>&lt;que text='电能质量' code='1050102'>&lt;/que>&lt;que text='电表' code='1050104'>&lt;/que>&lt;que text='电费' code='1050105'>&lt;/que>&lt;que text='一户一表' code='1050106'>&lt;/que>&lt;que text='电力建设' code='1050107'>&lt;/que>&lt;que text='电力安全' code='1050108'>&lt;/que>&lt;que text='电力服务' code='1050109'>&lt;/que>&lt;/que>&lt;que text='用水' code='10502'>&lt;que text='生活用水' code='1050201'>&lt;que text='停水' code='105020101'>&lt;/que>&lt;que text='水表' code='105020102'>&lt;/que>&lt;que text='一户一表' code='105020103'>&lt;/que>&lt;que text='水费' code='105020104'>&lt;/que>&lt;que text='水质' code='105020105'>&lt;/que>&lt;que text='水压' code='105020106'>&lt;/que>&lt;que text='设施抢修' code='105020107'>&lt;/que>&lt;que text='供水器' code='105020108'>&lt;/que>&lt;/que>&lt;que text='消防栓' code='1050202'>&lt;/que>&lt;/que>&lt;que text='燃气' code='10503'>&lt;que text='居民燃气服务' code='1050301'>&lt;/que>&lt;que text='液化气' code='1050302'>&lt;/que>&lt;que text='加气站' code='1050303'>&lt;/que>&lt;que text='燃气建设' code='1050304'>&lt;/que>&lt;que text='燃气费用' code='1050305'>&lt;/que>&lt;que text='燃气安全' code='1050306'>&lt;/que>&lt;que text='停气信息' code='1050307'>&lt;/que>&lt;que text='燃气设施' code='1050308'>&lt;/que>&lt;/que>&lt;que text='供暖' code='10504'>&lt;que text='开户' code='1050401'>&lt;/que>&lt;que text='报停' code='1050402'>&lt;/que>&lt;que text='温度不达标' code='1050403'>&lt;/que>&lt;que text='供暖费用' code='1050404'>&lt;/que>&lt;que text='供暖设施' code='1050405'>&lt;/que>&lt;que text='自管站' code='1050406'>&lt;/que>&lt;que text='供暖时间' code='1050407'>&lt;/que>&lt;que text='停暖信息' code='1050408'>&lt;/que>&lt;que text='过户' code='1050409'>&lt;/que>&lt;que text='供暖服务' code='1050410'>&lt;/que>&lt;que text='供暖调试' code='1050411'>&lt;/que>&lt;que text='暖气管道爆裂' code='1050412'>&lt;/que>&lt;que text='温度低' code='1050413'>&lt;/que>&lt;/que>&lt;que text='路灯' code='10505'>&lt;que text='维修' code='1050501'>&lt;/que>&lt;que text='安装' code='1050502'>&lt;/que>&lt;que text='亮灯时间' code='1050503'>&lt;/que>&lt;/que>&lt;que text='井盖' code='10506'>&lt;que text='井盖维护' code='1050601'>&lt;/que>&lt;que text='井盖纠纷' code='1050602'>&lt;/que>&lt;/que>&lt;que text='污水外溢' code='10507'>&lt;/que>&lt;que text='路面积水' code='10508'>&lt;/que>&lt;que text='石油' code='10509'>&lt;que text='油品质量' code='1050901'>&lt;/que>&lt;que text='油品数量' code='1050902'>&lt;/que>&lt;que text='站点服务' code='1050903'>&lt;/que>&lt;/que>&lt;que text='光伏' code='10510'>&lt;que text='项目建设' code='1051001'>&lt;/que>&lt;que text='并网接入' code='1051002'>&lt;/que>&lt;que text='补贴政策' code='1051003'>&lt;/que>&lt;/que>&lt;que text='其它' code='10511'>&lt;/que>&lt;que text='居民(民企)纠纷' code='10512'>&lt;/que>&lt;/que>&lt;/que>&lt;que text='经济综合' code='2'>&lt;que text='市场秩序' code='201'>&lt;que text='消费者维权' code='20101'>&lt;/que>&lt;que text='工商注册' code='20102'>&lt;/que>&lt;que text='无照经营' code='20103'>&lt;/que>&lt;que text='企业年检' code='20104'>&lt;/que>&lt;que text='虚假广告' code='20105'>&lt;/que>&lt;que text='传销' code='20106'>&lt;/que>&lt;que text='制售假冒伪劣' code='20107'>&lt;/que>&lt;que text='网络交易' code='20108'>&lt;/que>&lt;que text='违法直销' code='20109'>&lt;/que>&lt;que text='违规收费' code='20110'>&lt;/que>&lt;que text='明码标价' code='20111'>&lt;/que>&lt;que text='哄抬物价' code='20112'>&lt;/que>&lt;/que>&lt;que text='物价管理' code='202'>&lt;que text='乱收费' code='20201'>&lt;/que>&lt;que text='明码标价' code='20202'>&lt;/que>&lt;que text='哄抬物价' code='20203'>&lt;/que>&lt;/que>&lt;que text='商业贸易' code='203'>&lt;que text='会展服务' code='20301'>&lt;/que>&lt;que text='劳务输出' code='20302'>&lt;/que>&lt;que text='进出口管理' code='20303'>&lt;/que>&lt;que text='社区便民工程' code='20304'>&lt;/que>&lt;/que>&lt;que text='信息产业' code='204'>&lt;que text='线缆线杆维护' code='20401'>&lt;que text='线缆垂落' code='2040101'>&lt;/que>&lt;que text='线杆损坏' code='2040102'>&lt;/que>&lt;que text='杆线整治' code='2040103'>&lt;/que>&lt;/que>&lt;que text='通信设备' code='20402'>&lt;/que>&lt;que text='通讯运营监管' code='20403'>&lt;que text='资费' code='2040301'>&lt;/que>&lt;que text='通信故障' code='2040302'>&lt;/que>&lt;que text='互联网' code='2040303'>&lt;que text='互联网监管' code='204030301'>&lt;/que>&lt;que text='经营场所管理' code='204030302'>&lt;/que>&lt;/que>&lt;/que>&lt;que text='信息化建设' code='20404'>&lt;que text='软件行业管理' code='2040401'>&lt;/que>&lt;/que>&lt;que text='大数据应用' code='20405'>&lt;/que>&lt;que text='互联网应用' code='20406'>&lt;/que>&lt;/que>&lt;que text='质量监管' code='205'>&lt;que text='特种设备管理' code='20501'>&lt;que text='证书发放' code='2050101'>&lt;/que>&lt;que text='电梯监管' code='2050102'>&lt;/que>&lt;que text='大型游乐设施' code='2050103'>&lt;/que>&lt;que text='客运索道' code='2050104'>&lt;/que>&lt;que text='锅炉' code='2050105'>&lt;/que>&lt;que text='其他特种设备' code='2050106'>&lt;/que>&lt;/que>&lt;que text='生产加工' code='20502'>&lt;que text='黑作坊生产' code='2050201'>&lt;/que>&lt;que text='地沟油' code='2050202'>&lt;/que>&lt;/que>&lt;que text='证书发放' code='20503'>&lt;que text='餐饮服务许可证' code='2050301'>&lt;/que>&lt;que text='组织机构代码证' code='2050302'>&lt;/que>&lt;que text='特种设备证书发放' code='2050303'>&lt;/que>&lt;/que>&lt;que text='计量' code='20504'>&lt;que text='加油站计量' code='2050401'>&lt;/que>&lt;que text='出租车计量' code='2050402'>&lt;/que>&lt;que text='市场称计量' code='2050403'>&lt;/que>&lt;/que>&lt;que text='生产监督' code='20505'>&lt;que text='生产企业质量安全' code='2050501'>&lt;/que>&lt;que text='生产制造' code='2050502'>&lt;/que>&lt;que text='电梯年检' code='2050503'>&lt;/que>&lt;que text='桶装水生产' code='2050504'>&lt;/que>&lt;que text='黑作坊生产' code='2050505'>&lt;/que>&lt;/que>&lt;que text='食药安全' code='20506'>&lt;que text='保健食品' code='2050601'>&lt;/que>&lt;que text='化妆品' code='2050602'>&lt;/que>&lt;que text='药品和医疗器械管理' code='2050603'>&lt;/que>&lt;que text='添加剂' code='2050604'>&lt;/que>&lt;que text='保质期' code='2050605'>&lt;/que>&lt;que text='校园餐饮' code='2050606'>&lt;/que>&lt;que text='小饭桌' code='2050607'>&lt;/que>&lt;que text='注水肉监管' code='2050608'>&lt;/que>&lt;que text='食品安全' code='2050609'>&lt;/que>&lt;que text='地沟油' code='2050610'>&lt;/que>&lt;que text='桶装水生产' code='2050611'>&lt;/que>&lt;/que>&lt;que text='认证认可' code='20507'>&lt;/que>&lt;/que>&lt;que text='财税金融' code='206'>&lt;que text='会计管理' code='20601'>&lt;que text='继续教育' code='2060101'>&lt;/que>&lt;que text='会计证' code='2060102'>&lt;/que>&lt;/que>&lt;que text='税收征管' code='20602'>&lt;que text='国____税' code='2060201'>&lt;que text='偷税漏税' code='206020101'>&lt;/que>&lt;que text='税务政策' code='206020102'>&lt;/que>&lt;que text='税务登记' code='206020103'>&lt;/que>&lt;que text='发票管理' code='206020104'>&lt;/que>&lt;/que>&lt;que text='地____税' code='2060202'>&lt;que text='偷税漏税' code='206020201'>&lt;/que>&lt;que text='税务政策' code='206020202'>&lt;/que>&lt;que text='税务登记' code='206020203'>&lt;/que>&lt;que text='发票管理' code='206020204'>&lt;/que>&lt;/que>&lt;que text='偷税漏税' code='2060203'>&lt;/que>&lt;que text='税务政策' code='2060204'>&lt;/que>&lt;que text='税务登记' code='2060205'>&lt;/que>&lt;que text='发票管理' code='2060206'>&lt;/que>&lt;/que>&lt;que text='银行监管' code='20603'>&lt;/que>&lt;que text='证券监管' code='20604'>&lt;/que>&lt;que text='保险监管' code='20605'>&lt;/que>&lt;que text='财政补贴' code='20606'>&lt;que text='汽车下乡' code='2060601'>&lt;/que>&lt;que text='家电下乡' code='2060602'>&lt;/que>&lt;/que>&lt;que text='储蓄存款' code='20607'>&lt;/que>&lt;que text='信贷监督' code='20608'>&lt;/que>&lt;que text='审计工作' code='20609'>&lt;/que>&lt;que text='以旧换新' code='20610'>&lt;/que>&lt;/que>&lt;que text='国资监管' code='207'>&lt;que text='重组改制' code='20701'>&lt;/que>&lt;que text='企业破产' code='20702'>&lt;/que>&lt;que text='资产流失' code='20703'>&lt;/que>&lt;/que>&lt;que text='安全生产' code='208'>&lt;que text='安全事故' code='20801'>&lt;/que>&lt;que text='检查评估许可' code='20802'>&lt;/que>&lt;/que>&lt;que text='旅游管理' code='209'>&lt;que text='证件办理' code='20901'>&lt;/que>&lt;que text='旅行社管理' code='20902'>&lt;/que>&lt;/que>&lt;que text='招商引资' code='210'>&lt;que text='内商投资' code='21001'>&lt;que text='投资政策' code='2100101'>&lt;/que>&lt;que text='投资环境' code='2100102'>&lt;/que>&lt;que text='投资项目' code='2100103'>&lt;/que>&lt;/que>&lt;que text='外商投资' code='21002'>&lt;que text='投资政策' code='2100201'>&lt;/que>&lt;que text='投资环境' code='2100202'>&lt;/que>&lt;que text='投资项目' code='2100203'>&lt;/que>&lt;/que>&lt;/que>&lt;que text='知识产权' code='211'>&lt;que text='知识产权申报' code='21101'>&lt;/que>&lt;que text='知识产权保护' code='21102'>&lt;/que>&lt;que text='专利' code='21103'>&lt;/que>&lt;/que>&lt;/que>&lt;que text='社会事业' code='3'>&lt;que text='社会治安' code='301'>&lt;que text='治安管理' code='30101'>&lt;que text='养犬' code='3010101'>&lt;/que>&lt;que text='生活噪音' code='3010102'>&lt;/que>&lt;que text='爆炸物品' code='3010103'>&lt;/que>&lt;que text='公章刻制' code='3010104'>&lt;/que>&lt;que text='聚众集会' code='3010105'>&lt;/que>&lt;que text='其它' code='3010106'>&lt;/que>&lt;/que>&lt;que text='案件处理' code='30102'>&lt;que text='赌博' code='3010201'>&lt;/que>&lt;que text='毒品' code='3010202'>&lt;/que>&lt;que text='卖淫嫖娼' code='3010203'>&lt;/que>&lt;que text='打架斗殴' code='3010204'>&lt;/que>&lt;que text='盗窃' code='3010205'>&lt;/que>&lt;que text='命案侦破' code='3010206'>&lt;/que>&lt;que text='打黑除恶' code='3010207'>&lt;/que>&lt;que text='诈骗' code='3010208'>&lt;/que>&lt;que text='集资融资' code='3010209'>&lt;/que>&lt;que text='信访案件' code='3010210'>&lt;/que>&lt;que text='黄色网站举报' code='3010211'>&lt;/que>&lt;que text='复杂场所' code='3010212'>&lt;/que>&lt;que text='其它' code='3010213'>&lt;/que>&lt;/que>&lt;que text='消防管理' code='30103'>&lt;que text='防火监督' code='3010301'>&lt;que text='堵塞消防通道' code='301030101'>&lt;/que>&lt;que text='设施管理' code='301030102'>&lt;/que>&lt;/que>&lt;que text='消防出警' code='3010302'>&lt;/que>&lt;que text='其它' code='3010303'>&lt;/que>&lt;/que>&lt;que text='户政管理' code='30104'>&lt;que text='户籍业务' code='3010401'>&lt;que text='户籍转移' code='301040101'>&lt;/que>&lt;que text='户口更名' code='301040102'>&lt;/que>&lt;que text='落户' code='301040103'>&lt;/que>&lt;/que>&lt;que text='暂住证' code='3010402'>&lt;/que>&lt;que text='身份证' code='3010403'>&lt;/que>&lt;que text='信息查询' code='3010404'>&lt;/que>&lt;/que>&lt;que text='出入境管理' code='30105'>&lt;/que>&lt;que text='网络安全' code='30106'>&lt;que text='网吧管理' code='3010601'>&lt;/que>&lt;que text='案件侦查' code='3010602'>&lt;/que>&lt;/que>&lt;que text='110接处警' code='30107'>&lt;que text='接处警' code='3010701'>&lt;/que>&lt;/que>&lt;que text='爆破类开山采石' code='30108'>&lt;/que>&lt;que text='鞭炮禁放限放' code='30109'>&lt;/que>&lt;/que>&lt;que text='法律服务' code='302'>&lt;que text='法律援助' code='30201'>&lt;/que>&lt;que text='公证' code='30202'>&lt;/que>&lt;que text='仲裁' code='30203'>&lt;/que>&lt;que text='司法鉴定' code='30204'>&lt;/que>&lt;que text='律师管理' code='30205'>&lt;/que>&lt;que text='国家司法考试' code='30206'>&lt;/que>&lt;que text='法律咨询' code='30207'>&lt;que text='刑事案件' code='3020701'>&lt;/que>&lt;que text='民事案件' code='3020702'>&lt;/que>&lt;que text='诉讼程序' code='3020703'>&lt;/que>&lt;/que>&lt;que text='基层法律服务' code='30208'>&lt;/que>&lt;que text='社区矫正' code='30209'>&lt;/que>&lt;/que>&lt;que text='执法检查' code='303'>&lt;que text='生效法律文书执行' code='30301'>&lt;/que>&lt;/que>&lt;que text='警务督察' code='304'>&lt;que text='刑讯逼供' code='30401'>&lt;/que>&lt;que text='超期羁押' code='30402'>&lt;/que>&lt;que text='执法不力' code='30403'>&lt;/que>&lt;que text='包庇违法违纪人员' code='30404'>&lt;/que>&lt;que text='越权执法' code='30405'>&lt;/que>&lt;que text='民警违法违纪' code='30406'>&lt;/que>&lt;/que>&lt;que text='行政复议' code='305'>&lt;que text='复议申请' code='30501'>&lt;/que>&lt;que text='不服决定' code='30502'>&lt;/que>&lt;que text='决定执行' code='30503'>&lt;/que>&lt;/que>&lt;que text='监狱劳教' code='306'>&lt;que text='监狱管理' code='30601'>&lt;/que>&lt;que text='劳动教养' code='30602'>&lt;/que>&lt;/que>&lt;que text='民族宗教' code='307'>&lt;que text='民族事务' code='30701'>&lt;/que>&lt;que text='宗教事务' code='30702'>&lt;/que>&lt;/que>&lt;que text='科技工作' code='308'>&lt;que text='知识产权' code='30801'>&lt;que text='知识产权申报' code='3080101'>&lt;/que>&lt;que text='知识产权保护' code='3080102'>&lt;/que>&lt;/que>&lt;que text='专利' code='30802'>&lt;/que>&lt;que text='科学技术' code='30803'>&lt;que text='成果鉴定转化' code='3080301'>&lt;/que>&lt;que text='发展规划' code='3080302'>&lt;/que>&lt;/que>&lt;/que>&lt;que text='体育工作' code='309'>&lt;que text='体育竞赛' code='30901'>&lt;/que>&lt;que text='运动场所' code='30902'>&lt;/que>&lt;que text='体育设施' code='30903'>&lt;/que>&lt;que text='体育彩票' code='30904'>&lt;/que>&lt;/que>&lt;que text='文化工作' code='310'>&lt;que text='广播' code='31001'>&lt;/que>&lt;que text='电视' code='31002'>&lt;que text='数字电视' code='3100201'>&lt;que text='收费' code='310020101'>&lt;/que>&lt;que text='安装' code='310020102'>&lt;/que>&lt;que text='维修' code='310020103'>&lt;/que>&lt;/que>&lt;que text='移动电视' code='3100202'>&lt;/que>&lt;que text='网络电视' code='3100203'>&lt;/que>&lt;/que>&lt;que text='文化市场' code='31003'>&lt;que text='经营场所审批' code='3100301'>&lt;que text='网吧' code='310030101'>&lt;/que>&lt;que text='娱乐演出市场' code='310030102'>&lt;/que>&lt;/que>&lt;que text='文化产业、文物经营市场监管' code='3100302'>&lt;que text='网吧市场经营监管' code='310030201'>&lt;/que>&lt;que text='娱乐场所经营监管' code='310030202'>&lt;/que>&lt;que text='网络游戏经营监管' code='310030203'>&lt;/que>&lt;que text='美术品市场经营监管' code='310030204'>&lt;/que>&lt;que text='演出市场经营监管' code='310030205'>&lt;/que>&lt;que text='文物市场经营监管' code='310030206'>&lt;/que>&lt;/que>&lt;que text='广播电视电影市场监管' code='3100303'>&lt;que text='广播电视演出（传输）机构监管' code='310030301'>&lt;/que>&lt;que text='视频节目点播业务监管' code='310030302'>&lt;/que>&lt;que text='互联网视听节目监管' code='310030303'>&lt;/que>&lt;que text='广播电视设施监管' code='310030304'>&lt;/que>&lt;que text='卫星电视广播地面接收设施监管' code='310030305'>&lt;/que>&lt;que text='电影发行、放映市场监管' code='310030306'>&lt;/que>&lt;/que>&lt;que text='新闻出版市场监管' code='3100304'>&lt;que text='出版行业监管' code='310030401'>&lt;/que>&lt;que text='发行行业监管' code='310030402'>&lt;/que>&lt;que text='印刷复制行业监管' code='310030403'>&lt;/que>&lt;que text='著作权保护' code='310030404'>&lt;/que>&lt;/que>&lt;/que>&lt;que text='无线电管理' code='31004'>&lt;que text='许可证办理' code='3100401'>&lt;/que>&lt;que text='举报' code='3100402'>&lt;/que>&lt;/que>&lt;que text='文化遗产文物' code='31005'>&lt;que text='非物质文化遗产' code='3100501'>&lt;/que>&lt;que text='文物' code='3100502'>&lt;/que>&lt;/que>&lt;que text='新闻媒体' code='31006'>&lt;que text='电台新闻节目' code='3100601'>&lt;/que>&lt;que text='电视新闻节目' code='3100602'>&lt;/que>&lt;que text='报刊新闻报道' code='3100603'>&lt;/que>&lt;/que>&lt;que text='出版发行监管' code='31007'>&lt;que text='图书管理' code='3100701'>&lt;/que>&lt;que text='音像管理' code='3100702'>&lt;/que>&lt;/que>&lt;que text='新闻传媒' code='31008'>&lt;que text='报栏' code='3100801'>&lt;/que>&lt;que text='大屏幕' code='3100802'>&lt;/que>&lt;/que>&lt;que text='广电宽带' code='31009'>&lt;/que>&lt;/que>&lt;que text='教育' code='311'>&lt;que text='教育体制' code='31101'>&lt;que text='教育体制改革' code='3110101'>&lt;/que>&lt;que text='各类型教育统筹管理' code='3110102'>&lt;/que>&lt;/que>&lt;que text='考试招生' code='31102'>&lt;que text='招生录取' code='3110201'>&lt;/que>&lt;que text='考场考纪' code='3110202'>&lt;/que>&lt;que text='证件管理' code='3110203'>&lt;/que>&lt;/que>&lt;que text='教育管理' code='31103'>&lt;que text='教学管理' code='3110301'>&lt;/que>&lt;que text='教育经费' code='3110302'>&lt;/que>&lt;que text='学历学位学籍管理' code='3110303'>&lt;/que>&lt;que text='学生负担' code='3110304'>&lt;/que>&lt;que text='民办学校' code='3110305'>&lt;/que>&lt;que text='校园安全' code='3110306'>&lt;/que>&lt;que text='校园管理' code='3110307'>&lt;que text='校园安全' code='311030701'>&lt;/que>&lt;que text='校舍环境' code='311030702'>&lt;/que>&lt;/que>&lt;que text='社会办班' code='3110308'>&lt;/que>&lt;que text='课外办班' code='3110309'>&lt;/que>&lt;que text='违规办学' code='3110310'>&lt;/que>&lt;/que>&lt;que text='幼儿园管理' code='31104'>&lt;/que>&lt;que text='教师队伍和待遇' code='31105'>&lt;que text='师资力量' code='3110501'>&lt;/que>&lt;que text='工资待遇' code='3110502'>&lt;/que>&lt;que text='教师违纪' code='3110503'>&lt;que text='缺课' code='311050301'>&lt;/que>&lt;que text='体罚学生' code='311050302'>&lt;/que>&lt;/que>&lt;/que>&lt;que text='教育收费' code='31106'>&lt;que text='收费标准' code='3110601'>&lt;/que>&lt;que text='乱收费' code='3110602'>&lt;/que>&lt;/que>&lt;que text='教育管理' code='31107'>&lt;que text='社会办班' code='3110701'>&lt;/que>&lt;que text='课外办班' code='3110702'>&lt;/que>&lt;/que>&lt;que text='外来务工子女入学' code='31108'>&lt;/que>&lt;/que>&lt;que text='卫生' code='312'>&lt;que text='卫生防疫' code='31201'>&lt;que text='保健食品化妆品管理' code='3120101'>&lt;/que>&lt;que text='疾病预防控制' code='3120102'>&lt;que text='疫苗注射' code='312010201'>&lt;/que>&lt;que text='传染病控制' code='312010202'>&lt;/que>&lt;que text='防疫证' code='312010203'>&lt;/que>&lt;que text='慢性病防控' code='312010204'>&lt;/que>&lt;/que>&lt;que text='突发公共卫生事件处理' code='3120103'>&lt;/que>&lt;que text='卫生行政审批' code='3120104'>&lt;/que>&lt;que text='健康证' code='3120105'>&lt;/que>&lt;/que>&lt;que text='医政医药监管' code='31202'>&lt;que text='医疗机构管理' code='3120201'>&lt;/que>&lt;que text='医务人员管理' code='3120202'>&lt;/que>&lt;que text='药品和医疗器械管理' code='3120203'>&lt;que text='药品安全' code='312020301'>&lt;/que>&lt;/que>&lt;que text='医药收费' code='3120204'>&lt;/que>&lt;que text='非法行医' code='3120205'>&lt;/que>&lt;que text='卫生执法' code='3120206'>&lt;/que>&lt;/que>&lt;que text='医患纠纷' code='31203'>&lt;que text='医疗事故' code='3120301'>&lt;/que>&lt;/que>&lt;que text='动物防疫' code='31204'>&lt;/que>&lt;que text='无偿献血' code='31205'>&lt;/que>&lt;que text='心理咨询' code='31206'>&lt;/que>&lt;que text='2020年冠状病毒疫情' code='31207'>&lt;/que>&lt;/que>&lt;que text='人口计生' code='313'>&lt;que text='计生政策' code='31301'>&lt;/que>&lt;que text='独生子女' code='31302'>&lt;/que>&lt;que text='计生执法' code='31303'>&lt;/que>&lt;que text='服务管理' code='31304'>&lt;/que>&lt;que text='违法生育' code='31305'>&lt;/que>&lt;que text='行政侵权' code='31306'>&lt;/que>&lt;que text='违规收费' code='31307'>&lt;/que>&lt;que text='失职渎职' code='31308'>&lt;/que>&lt;que text='奖励优待' code='31309'>&lt;/que>&lt;que text='办证问题' code='31310'>&lt;que text='独生子女证' code='3131001'>&lt;/que>&lt;que text='准生证' code='3131002'>&lt;/que>&lt;que text='出生证明' code='3131003'>&lt;/que>&lt;/que>&lt;que text='手术并发症' code='31311'>&lt;/que>&lt;/que>&lt;que text='民政' code='314'>&lt;que text='基层政权和社区建设' code='31401'>&lt;que text='基层政权建设' code='3140101'>&lt;/que>&lt;que text='社区建设' code='3140102'>&lt;/que>&lt;/que>&lt;que text='双拥工作' code='31409'>&lt;que text='拥军优属' code='3140901'>&lt;/que>&lt;/que>&lt;que text='优待抚恤' code='31410'>&lt;que text='烈士褒扬' code='3141001'>&lt;/que>&lt;que text='军人抚恤' code='3141002'>&lt;/que>&lt;que text='济南革命烈士陵园' code='3141003'>&lt;/que>&lt;/que>&lt;que text='救灾救济和社会救助' code='31411'>&lt;que text='救灾救济' code='3141101'>&lt;que text='灾害救助' code='314110101'>&lt;/que>&lt;que text='防灾减灾' code='314110102'>&lt;/que>&lt;/que>&lt;que text='社会救助' code='3141102'>&lt;que text='城市低保' code='314110201'>&lt;/que>&lt;que text='农村低保' code='314110202'>&lt;/que>&lt;que text='农村五保' code='314110203'>&lt;/que>&lt;que text='医疗救助' code='314110204'>&lt;/que>&lt;que text='临时救助' code='314110205'>&lt;/que>&lt;/que>&lt;/que>&lt;que text='区域地名' code='31412'>&lt;que text='地名管理' code='3141201'>&lt;/que>&lt;que text='行政区划' code='3141202'>&lt;/que>&lt;que text='路名牌保洁维护' code='3141203'>&lt;/que>&lt;/que>&lt;que text='社会组织管理' code='31413'>&lt;que text='社会组织登记' code='3141301'>&lt;que text='社会团体登记' code='314130101'>&lt;/que>&lt;que text='民办非企业单位登记' code='314130102'>&lt;/que>&lt;que text='非公募基金会登记' code='314130103'>&lt;/que>&lt;/que>&lt;que text='社会组织管理' code='3141302'>&lt;que text='社会组织年审' code='314130201'>&lt;/que>&lt;que text='社会组织换届' code='314130202'>&lt;/que>&lt;/que>&lt;que text='社会组织综合执法' code='3141303'>&lt;que text='社会团体执法' code='314130301'>&lt;/que>&lt;que text='民办非企业单位执法' code='314130302'>&lt;/que>&lt;que text='非公募基金会执法' code='314130303'>&lt;/que>&lt;/que>&lt;/que>&lt;que text='军休安置' code='31414'>&lt;que text='军队离休退休干部服务管理' code='3141401'>&lt;/que>&lt;que text='退役士兵安置' code='3141402'>&lt;/que>&lt;/que>&lt;que text='社会福利和慈善事业' code='31415'>&lt;que text='老人、儿童等特殊群体保障' code='3141501'>&lt;que text='社会福利机构' code='314150101'>&lt;/que>&lt;que text='儿童福利院' code='314150102'>&lt;/que>&lt;que text='精神病院' code='314150103'>&lt;/que>&lt;que text='养老' code='314150104'>&lt;/que>&lt;que text='福利企业' code='314150105'>&lt;/que>&lt;/que>&lt;que text='慈善捐助' code='3141502'>&lt;/que>&lt;que text='福利彩票发行' code='3141503'>&lt;/que>&lt;/que>&lt;que text='社会事务' code='31416'>&lt;que text='婚姻登记' code='3141601'>&lt;que text='结婚' code='314160101'>&lt;/que>&lt;que text='离婚' code='314160102'>&lt;/que>&lt;que text='婚姻登记记录证明' code='314160103'>&lt;/que>&lt;/que>&lt;que text='婚姻中介' code='3141602'>&lt;/que>&lt;que text='殡葬管理' code='3141603'>&lt;que text='殡仪馆' code='314160301'>&lt;/que>&lt;que text='公墓' code='314160302'>&lt;/que>&lt;/que>&lt;que text='收养登记' code='3141604'>&lt;/que>&lt;que text='流浪人员救助' code='3141605'>&lt;/que>&lt;/que>&lt;que text='贴心民政' code='31417'>&lt;/que>&lt;/que>&lt;que text='文明建设' code='315'>&lt;que text='公益广告' code='31501'>&lt;/que>&lt;que text='宣传教育' code='31502'>&lt;/que>&lt;que text='志愿服务' code='31503'>&lt;/que>&lt;/que>&lt;/que>&lt;que text='城乡建设' code='4'>&lt;que text='拆迁安置' code='401'>&lt;que text='安置补偿' code='40101'>&lt;que text='补偿政策' code='4010101'>&lt;/que>&lt;que text='安置政策' code='4010102'>&lt;/que>&lt;que text='过渡费' code='4010103'>&lt;/que>&lt;/que>&lt;que text='拆迁政策咨询' code='40102'>&lt;/que>&lt;que text='违章拆迁' code='40103'>&lt;/que>&lt;que text='回迁房' code='40104'>&lt;/que>&lt;/que>&lt;que text='道路修建' code='402'>&lt;que text='施工工期' code='40201'>&lt;/que>&lt;que text='违章施工' code='40202'>&lt;/que>&lt;que text='道路养护' code='40203'>&lt;/que>&lt;que text='道路改造' code='40204'>&lt;/que>&lt;que text='修建计划' code='40205'>&lt;/que>&lt;que text='人行过街天桥' code='40206'>&lt;/que>&lt;que text='高架桥' code='40207'>&lt;/que>&lt;que text='隧道' code='40208'>&lt;/que>&lt;/que>&lt;que text='住房与房地产' code='403'>&lt;que text='商品房开发与销售' code='40301'>&lt;que text='工程质量' code='4030101'>&lt;/que>&lt;que text='承诺办证' code='4030102'>&lt;/que>&lt;que text='配套费' code='4030103'>&lt;/que>&lt;que text='合同网签' code='4030104'>&lt;/que>&lt;que text='延期交房' code='4030105'>&lt;/que>&lt;que text='限购令' code='4030106'>&lt;/que>&lt;que text='预售许可' code='4030107'>&lt;/que>&lt;/que>&lt;que text='产权市场' code='40302'>&lt;que text='产权交易' code='4030201'>&lt;/que>&lt;que text='房产中介' code='4030202'>&lt;/que>&lt;que text='合同备案' code='4030203'>&lt;/que>&lt;que text='房屋查档' code='4030204'>&lt;/que>&lt;/que>&lt;que text='保障房建设与管理' code='40303'>&lt;que text='公租房' code='4030301'>&lt;que text='开发建设' code='403030101'>&lt;/que>&lt;que text='后期管理' code='403030102'>&lt;/que>&lt;/que>&lt;que text='廉租房' code='4030302'>&lt;que text='开发建设' code='403030201'>&lt;/que>&lt;que text='后期管理' code='403030202'>&lt;/que>&lt;/que>&lt;que text='廉租补贴发放' code='4030303'>&lt;/que>&lt;que text='经济适用房' code='4030304'>&lt;/que>&lt;que text='房改问题' code='4030305'>&lt;/que>&lt;/que>&lt;que text='物业管理' code='40304'>&lt;que text='物业服务' code='4030401'>&lt;/que>&lt;que text='开发遗留' code='4030402'>&lt;que text='使用地下水' code='403040201'>&lt;/que>&lt;que text='电容量不足' code='403040202'>&lt;/que>&lt;que text='停车位不足' code='403040203'>&lt;/que>&lt;que text='无公用设施' code='403040204'>&lt;/que>&lt;que text='道路修建' code='403040205'>&lt;/que>&lt;que text='无供暖设施' code='403040206'>&lt;/que>&lt;/que>&lt;que text='维修资金' code='4030403'>&lt;/que>&lt;que text='水电暖维修' code='4030404'>&lt;/que>&lt;que text='停车位收费' code='4030405'>&lt;/que>&lt;que text='住改商' code='4030406'>&lt;/que>&lt;que text='违规搭建' code='4030407'>&lt;/que>&lt;que text='装饰装修' code='4030408'>&lt;/que>&lt;/que>&lt;que text='房屋维修' code='40305'>&lt;/que>&lt;que text='平改坡' code='40306'>&lt;/que>&lt;que text='建筑企业管理' code='40307'>&lt;que text='二级建造师' code='4030701'>&lt;/que>&lt;/que>&lt;que text='建筑项目管理' code='40308'>&lt;que text='建设项目行政审批' code='4030801'>&lt;/que>&lt;/que>&lt;que text='老旧小区电梯加装' code='40309'>&lt;/que>&lt;/que>&lt;que text='园林绿化' code='404'>&lt;que text='城市绿化' code='40401'>&lt;/que>&lt;que text='公园景区' code='40402'>&lt;que text='票价' code='4040201'>&lt;/que>&lt;que text='设施维护' code='4040202'>&lt;/que>&lt;que text='开放时间' code='4040203'>&lt;/que>&lt;que text='景区管理' code='4040204'>&lt;/que>&lt;que text='公园年票' code='4040205'>&lt;/que>&lt;/que>&lt;que text='伐移树木' code='40403'>&lt;/que>&lt;que text='虫害防治' code='40404'>&lt;/que>&lt;que text='名泉保护' code='40405'>&lt;/que>&lt;que text='街道景观' code='40406'>&lt;/que>&lt;que text='山体公园' code='40407'>&lt;/que>&lt;/que>&lt;que text='城乡规划' code='405'>&lt;que text='规划编制' code='40501'>&lt;que text='总体规划' code='4050101'>&lt;/que>&lt;que text='控制性规划' code='4050102'>&lt;/que>&lt;/que>&lt;que text='建设用地规划管理' code='40502'>&lt;que text='建设用地规划许可证' code='4050201'>&lt;/que>&lt;que text='道路广场用地规划' code='4050202'>&lt;que text='道路走向、道路红线宽度' code='405020201'>&lt;/que>&lt;/que>&lt;que text='市政公用设施用地规划' code='4050203'>&lt;/que>&lt;que text='水域用地规划' code='4050204'>&lt;que text='河道走向、河道蓝线宽度' code='405020401'>&lt;/que>&lt;/que>&lt;/que>&lt;que text='建设工程规划管理' code='40503'>&lt;que text='建设工程规划许可证' code='4050301'>&lt;/que>&lt;que text='建设工程规划核实证' code='4050302'>&lt;/que>&lt;/que>&lt;/que>&lt;que text='人防工作' code='406'>&lt;que text='收费' code='40601'>&lt;/que>&lt;que text='纳凉工程' code='40602'>&lt;/que>&lt;que text='人防管理' code='40603'>&lt;/que>&lt;que text='防空洞' code='40604'>&lt;/que>&lt;/que>&lt;que text='建筑市场管理' code='407'>&lt;/que>&lt;que text='工程质量' code='408'>&lt;que text='工程招投标' code='40801'>&lt;/que>&lt;que text='工程安全监督' code='40802'>&lt;/que>&lt;que text='建筑质量' code='40803'>&lt;/que>&lt;/que>&lt;/que>&lt;que text='自然资源' code='5'>&lt;que text='国土资源' code='501'>&lt;que text='土地管理' code='50101'>&lt;que text='土地使用年限' code='5010101'>&lt;/que>&lt;que text='土地滞留' code='5010102'>&lt;/que>&lt;que text='土地审批（土地证）' code='5010103'>&lt;/que>&lt;que text='土地规划' code='5010104'>&lt;que text='破坏山体' code='501010401'>&lt;/que>&lt;que text='私自开采' code='501010402'>&lt;/que>&lt;que text='土地复垦' code='501010403'>&lt;/que>&lt;que text='占用农耕地' code='501010404'>&lt;/que>&lt;/que>&lt;/que>&lt;que text='土地征用' code='50102'>&lt;que text='审批手续不规范' code='5010201'>&lt;/que>&lt;que text='安置补偿不合理' code='5010202'>&lt;/que>&lt;que text='以租代征' code='5010203'>&lt;/que>&lt;que text='失地农民保障' code='5010204'>&lt;/que>&lt;/que>&lt;que text='矿产资源管理' code='50103'>&lt;que text='地质勘探勘查' code='5010301'>&lt;/que>&lt;que text='矿产开采' code='5010302'>&lt;/que>&lt;que text='采矿沉陷区' code='5010303'>&lt;/que>&lt;que text='权属纠纷' code='5010304'>&lt;/que>&lt;/que>&lt;/que>&lt;que text='水利' code='502'>&lt;que text='水利工程' code='50201'>&lt;que text='防汛抗旱' code='5020101'>&lt;/que>&lt;que text='地下水管理' code='5020102'>&lt;/que>&lt;que text='权属纠纷' code='5020103'>&lt;/que>&lt;que text='水利建设管理' code='5020104'>&lt;/que>&lt;/que>&lt;que text='水库移民' code='50202'>&lt;que text='移民补偿安置' code='5020201'>&lt;/que>&lt;que text='后期扶持' code='5020202'>&lt;/que>&lt;/que>&lt;/que>&lt;que text='林业' code='503'>&lt;que text='林业管理' code='50301'>&lt;que text='国有林业资产管理' code='5030101'>&lt;/que>&lt;que text='水土流失' code='5030102'>&lt;/que>&lt;que text='退耕还林' code='5030103'>&lt;/que>&lt;que text='采伐运输' code='5030104'>&lt;/que>&lt;que text='森林防火' code='5030105'>&lt;/que>&lt;que text='野生动植物保护' code='5030106'>&lt;/que>&lt;que text='权属纠纷' code='5030107'>&lt;/que>&lt;/que>&lt;que text='自然灾害' code='50302'>&lt;que text='地震' code='5030201'>&lt;/que>&lt;que text='火灾' code='5030202'>&lt;/que>&lt;que text='核辐射' code='5030203'>&lt;/que>&lt;que text='涝灾' code='5030204'>&lt;/que>&lt;que text='旱灾' code='5030205'>&lt;/que>&lt;/que>&lt;/que>&lt;que text='气象监测' code='504'>&lt;/que>&lt;/que>&lt;que text='人力资源保障' code='6'>&lt;que text='社会保险政策' code='601'>&lt;que text='养老保险' code='60101'>&lt;que text='农村社会养老保险' code='6010101'>&lt;/que>&lt;que text='职工养老保险' code='6010102'>&lt;/que>&lt;que text='城镇居民社会养老保险' code='6010103'>&lt;/que>&lt;/que>&lt;que text='医疗保险' code='60102'>&lt;que text='城镇职工基本医疗保险' code='6010201'>&lt;que text='门规' code='601020101'>&lt;/que>&lt;que text='其它' code='601020102'>&lt;/que>&lt;que text='医保卡办理' code='601020103'>&lt;/que>&lt;que text='医疗保险报销' code='601020104'>&lt;/que>&lt;que text='缴费' code='601020105'>&lt;/que>&lt;que text='门诊统筹' code='601020106'>&lt;/que>&lt;que text='社保转移' code='601020107'>&lt;/que>&lt;/que>&lt;que text='城镇居民基本医疗保险' code='6010202'>&lt;que text='门规' code='601020201'>&lt;/que>&lt;que text='其它' code='601020202'>&lt;/que>&lt;que text='医保卡办理' code='601020203'>&lt;/que>&lt;que text='医疗保险报销' code='601020204'>&lt;/que>&lt;que text='缴费' code='601020205'>&lt;/que>&lt;que text='门诊统筹' code='601020206'>&lt;/que>&lt;que text='新生儿医保' code='601020207'>&lt;/que>&lt;que text='大学生医保' code='601020208'>&lt;/que>&lt;que text='社保转移' code='601020209'>&lt;/que>&lt;/que>&lt;que text='新农合' code='6010203'>&lt;/que>&lt;que text='公费医疗' code='6010204'>&lt;/que>&lt;/que>&lt;que text='失业保险' code='60103'>&lt;/que>&lt;que text='工伤保险' code='60104'>&lt;/que>&lt;que text='生育保险' code='60105'>&lt;/que>&lt;que text='住房公积金' code='60106'>&lt;que text='缴费' code='6010601'>&lt;/que>&lt;que text='使用' code='6010602'>&lt;/que>&lt;que text='申领' code='6010603'>&lt;/que>&lt;/que>&lt;que text='五险一金' code='60107'>&lt;/que>&lt;/que>&lt;que text='企业工资福利' code='602'>&lt;que text='工资调整' code='60201'>&lt;/que>&lt;que text='拖欠工资' code='60202'>&lt;/que>&lt;que text='职工福利' code='60203'>&lt;/que>&lt;/que>&lt;que text='就业创业' code='603'>&lt;que text='资格认定' code='60301'>&lt;/que>&lt;que text='职业培训' code='60302'>&lt;/que>&lt;que text='人事考试' code='60303'>&lt;/que>&lt;que text='创业政策' code='60304'>&lt;/que>&lt;que text='毕业生档案转递' code='60305'>&lt;/que>&lt;que text='高校毕业生就业派遣' code='60306'>&lt;/que>&lt;/que>&lt;que text='劳动保护' code='604'>&lt;que text='劳动安全' code='60401'>&lt;/que>&lt;que text='女工保护' code='60402'>&lt;/que>&lt;que text='最低工资标准' code='60403'>&lt;/que>&lt;que text='工作时间和休息休假' code='60404'>&lt;/que>&lt;que text='特殊工种' code='60405'>&lt;/que>&lt;/que>&lt;que text='劳动纠纷' code='605'>&lt;que text='非法用工' code='60501'>&lt;/que>&lt;que text='劳动合同' code='60502'>&lt;/que>&lt;que text='收取抵押金抵押物' code='60503'>&lt;/que>&lt;que text='农民工工资支付' code='60504'>&lt;/que>&lt;que text='社会保险纠纷' code='60505'>&lt;/que>&lt;/que>&lt;que text='企业离休退休' code='606'>&lt;que text='离退休政策' code='60601'>&lt;/que>&lt;que text='拖欠离退休金' code='60602'>&lt;/que>&lt;que text='福利补贴' code='60603'>&lt;/que>&lt;/que>&lt;que text='人才交流' code='607'>&lt;que text='档案管理' code='60701'>&lt;/que>&lt;que text='人才服务' code='60702'>&lt;/que>&lt;que text='党组织转接' code='60703'>&lt;/que>&lt;/que>&lt;que text='招录辞退' code='608'>&lt;que text='干部任免' code='60801'>&lt;/que>&lt;que text='招聘录用' code='60802'>&lt;/que>&lt;/que>&lt;que text='职务职称' code='609'>&lt;que text='辞退' code='60901'>&lt;/que>&lt;que text='职务升降' code='60902'>&lt;/que>&lt;/que>&lt;que text='市直机关事业单位工资待遇' code='610'>&lt;que text='职称评定' code='61001'>&lt;/que>&lt;que text='在职人员工资待遇' code='61002'>&lt;/que>&lt;/que>&lt;que text='军队转业' code='611'>&lt;que text='军转干部政策' code='61101'>&lt;/que>&lt;que text='军转干部安置' code='61102'>&lt;/que>&lt;/que>&lt;/que>&lt;que text='三农问题' code='7'>&lt;que text='农村工作' code='701'>&lt;que text='村务公开' code='70101'>&lt;/que>&lt;que text='承包争议' code='70102'>&lt;/que>&lt;que text='土地流转' code='70103'>&lt;/que>&lt;que text='宅基地' code='70104'>&lt;/que>&lt;que text='占地补偿' code='70105'>&lt;/que>&lt;que text='耕地分配' code='70106'>&lt;/que>&lt;que text='旧村改造' code='70107'>&lt;/que>&lt;que text='干部作风' code='70108'>&lt;que text='工作效率' code='7010801'>&lt;que text='推诿扯皮' code='701080101'>&lt;/que>&lt;que text='超时超限' code='701080102'>&lt;/que>&lt;/que>&lt;que text='服务质量' code='7010802'>&lt;que text='不作为' code='701080201'>&lt;/que>&lt;que text='乱作为' code='701080202'>&lt;/que>&lt;que text='服务态度差' code='701080203'>&lt;/que>&lt;/que>&lt;que text='工作作风' code='7010803'>&lt;que text='违反纪律' code='701080301'>&lt;/que>&lt;que text='弄虚作假' code='701080302'>&lt;/que>&lt;que text='打击报复' code='701080303'>&lt;/que>&lt;/que>&lt;/que>&lt;que text='村干部' code='70109'>&lt;que text='村干部选举' code='7010901'>&lt;/que>&lt;/que>&lt;que text='道德文化建设' code='70110'>&lt;/que>&lt;/que>&lt;que text='农民生活' code='702'>&lt;que text='农民收入' code='70201'>&lt;que text='农业补贴发放' code='7020101'>&lt;/que>&lt;/que>&lt;que text='农民负担' code='70202'>&lt;que text='乱摊派' code='7020201'>&lt;/que>&lt;/que>&lt;que text='村民纠纷' code='70203'>&lt;/que>&lt;que text='村民待遇' code='70204'>&lt;/que>&lt;/que>&lt;que text='农业生产' code='703'>&lt;que text='耕地灌溉' code='70301'>&lt;/que>&lt;que text='农资农技' code='70302'>&lt;/que>&lt;que text='农产品流通' code='70303'>&lt;/que>&lt;que text='破坏农耕用地' code='70304'>&lt;/que>&lt;/que>&lt;que text='精准扶贫' code='704'>&lt;que text='产业扶贫' code='70401'>&lt;que text='种植、养殖' code='7040101'>&lt;/que>&lt;que text='乡村旅游' code='7040102'>&lt;/que>&lt;que text='农村电商' code='7040103'>&lt;/que>&lt;que text='光伏发电' code='7040104'>&lt;/que>&lt;que text='项目扶持' code='7040105'>&lt;/que>&lt;/que>&lt;que text='就业扶贫' code='70402'>&lt;que text='转移就业' code='7040201'>&lt;/que>&lt;que text='扶贫车间' code='7040202'>&lt;/que>&lt;que text='龙头企业带动' code='7040203'>&lt;/que>&lt;que text='公益性岗位安置' code='7040204'>&lt;/que>&lt;/que>&lt;que text='教育扶贫' code='70403'>&lt;que text='贫困学生救助' code='7040301'>&lt;/que>&lt;que text='雨露计划' code='7040302'>&lt;/que>&lt;que text='泛海助学行动' code='7040303'>&lt;/que>&lt;/que>&lt;que text='医疗扶贫' code='70404'>&lt;que text='免费查体' code='7040401'>&lt;/que>&lt;que text='帮扶病种' code='7040402'>&lt;/que>&lt;que text='“三免六减半”' code='7040403'>&lt;/que>&lt;que text='送药上门' code='7040404'>&lt;/que>&lt;que text='门诊住院帮扶' code='7040405'>&lt;/que>&lt;que text='失能人员护理' code='7040406'>&lt;/que>&lt;que text='重性精神病人管理' code='7040407'>&lt;/que>&lt;/que>&lt;que text='兜底脱贫' code='70405'>&lt;que text='残疾人救助' code='7040501'>&lt;/que>&lt;que text='计生救助' code='7040502'>&lt;/que>&lt;que text='孤儿保障' code='7040503'>&lt;/que>&lt;/que>&lt;que text='金融扶贫' code='70406'>&lt;que text='富民农户贷' code='7040601'>&lt;/que>&lt;que text='富民生产贷' code='7040602'>&lt;/que>&lt;que text='“3+1”“扶贫特惠保”' code='7040603'>&lt;/que>&lt;/que>&lt;que text='其他' code='70407'>&lt;que text='易地扶贫搬迁' code='7040701'>&lt;/que>&lt;que text='社会帮扶' code='7040702'>&lt;/que>&lt;que text='危房改造' code='7040703'>&lt;/que>&lt;/que>&lt;/que>&lt;/que>&lt;que text='党风政风行风' code='8'>&lt;que text='行政效能' code='805'>&lt;que text='工作效率' code='80501'>&lt;que text='推诿扯皮' code='8050101'>&lt;/que>&lt;que text='超时超限' code='8050102'>&lt;/que>&lt;que text='擅离职守' code='8050103'>&lt;/que>&lt;/que>&lt;que text='服务质量' code='80502'>&lt;que text='不作为' code='8050201'>&lt;/que>&lt;que text='乱作为' code='8050202'>&lt;/que>&lt;que text='服务态度差' code='8050203'>&lt;/que>&lt;/que>&lt;que text='工作作风' code='80503'>&lt;que text='违反工作纪律' code='8050301'>&lt;/que>&lt;que text='弄虚作假' code='8050302'>&lt;/que>&lt;que text='吃拿卡要' code='8050303'>&lt;/que>&lt;/que>&lt;/que>&lt;que text='违反中央八项规定精神' code='806'>&lt;que text='违规公款吃喝' code='80604'>&lt;/que>&lt;que text='违规公款旅游' code='80605'>&lt;/que>&lt;que text='违规配备、使用公务用车' code='80606'>&lt;/que>&lt;que text='楼堂馆所违规问题' code='80607'>&lt;/que>&lt;que text='违规发放津补贴或福利' code='80608'>&lt;/que>&lt;que text='违规收送礼品礼金' code='80609'>&lt;/que>&lt;que text='大办婚丧喜庆' code='80610'>&lt;/que>&lt;que text='其他' code='80611'>&lt;/que>&lt;/que>&lt;que text='行政执法' code='807'>&lt;que text='越权执法' code='80701'>&lt;/que>&lt;que text='消极执法' code='80702'>&lt;/que>&lt;que text='态度粗暴' code='80703'>&lt;/que>&lt;que text='乱扣、乱押' code='80704'>&lt;/que>&lt;que text='其他' code='80705'>&lt;/que>&lt;/que>&lt;que text='违法方面' code='808'>&lt;que text='贪污' code='80801'>&lt;/que>&lt;que text='受贿' code='80802'>&lt;/que>&lt;que text='挪用公款' code='80803'>&lt;/que>&lt;que text='私分' code='80804'>&lt;/que>&lt;que text='职务侵占' code='80805'>&lt;/que>&lt;que text='巨额财政来源不明' code='80806'>&lt;/que>&lt;que text='其他' code='80807'>&lt;/que>&lt;/que>&lt;/que>&lt;que text='其它' code='9'>&lt;que text='人大工作' code='901'>&lt;/que>&lt;que text='政协工作' code='902'>&lt;/que>&lt;que text='机构编制' code='903'>&lt;que text='机构编制实名制' code='90301'>&lt;que text='编制使用' code='9030101'>&lt;/que>&lt;que text='人员入减编' code='9030102'>&lt;/que>&lt;/que>&lt;que text='行政机构编制管理' code='90302'>&lt;que text='政府机构改革' code='9030201'>&lt;/que>&lt;que text='乡镇机构改革' code='9030202'>&lt;/que>&lt;/que>&lt;que text='事业机构编制管理' code='90303'>&lt;que text='事业单位改革' code='9030301'>&lt;/que>&lt;/que>&lt;que text='事业单位法人登记管理' code='90304'>&lt;/que>&lt;que text='网上域名管理' code='90305'>&lt;/que>&lt;/que>&lt;que text='历史遗留' code='904'>&lt;que text='破产清算' code='90401'>&lt;/que>&lt;que text='三支一扶' code='90402'>&lt;/que>&lt;que text='支边知青' code='90403'>&lt;/que>&lt;que text='企业改制' code='90404'>&lt;/que>&lt;que text='40、50人员' code='90405'>&lt;/que>&lt;que text='家属工、五七工' code='90406'>&lt;/que>&lt;/que>&lt;que text='联动单位' code='905'>&lt;que text='老龄委' code='90501'>&lt;/que>&lt;que text='市台办' code='90502'>&lt;/que>&lt;que text='工会工作' code='90503'>&lt;/que>&lt;que text='共青团工作' code='90504'>&lt;/que>&lt;que text='市妇联' code='90505'>&lt;/que>&lt;que text='济南火车站' code='90506'>&lt;/que>&lt;que text='山东机场' code='90507'>&lt;/que>&lt;que text='山东高速集团' code='90508'>&lt;/que>&lt;que text='长途汽车总站' code='90509'>&lt;/que>&lt;que text='山东广播电台生活频道' code='90510'>&lt;/que>&lt;que text='山东广电报刊中心' code='90511'>&lt;/que>&lt;que text='市科协' code='90512'>&lt;/que>&lt;que text='市检察院' code='90513'>&lt;/que>&lt;que text='济南铁路局' code='90514'>&lt;/que>&lt;que text='济南日报' code='90515'>&lt;/que>&lt;que text='济南边检站' code='90516'>&lt;/que>&lt;que text='济南慈善总会' code='90517'>&lt;/que>&lt;que text='联通公司' code='90518'>&lt;/que>&lt;que text='移动公司' code='90519'>&lt;/que>&lt;que text='电信公司' code='90520'>&lt;/que>&lt;que text='铁通公司' code='90521'>&lt;/que>&lt;que text='市法院' code='90522'>&lt;/que>&lt;que text='邮政' code='90523'>&lt;/que>&lt;/que>&lt;que text='信息查询' code='906'>&lt;que text='地址查询' code='90601'>&lt;/que>&lt;que text='电话查询' code='90602'>&lt;/que>&lt;que text='其他查询' code='90603'>&lt;/que>&lt;/que>&lt;que text='表扬感谢' code='907'>&lt;que text='市政府' code='90701'>&lt;que text='电话' code='9070101'>&lt;/que>&lt;que text='锦旗' code='9070102'>&lt;/que>&lt;/que>&lt;que text='县（市）区政府' code='90702'>&lt;que text='电话' code='9070201'>&lt;/que>&lt;que text='锦旗' code='9070202'>&lt;/que>&lt;/que>&lt;que text='市政府部门' code='90703'>&lt;que text='电话' code='9070301'>&lt;/que>&lt;que text='锦旗' code='9070302'>&lt;/que>&lt;/que>&lt;/que>&lt;que text='港澳台侨' code='908'>&lt;que text='侨务' code='90801'>&lt;/que>&lt;que text='港澳事务' code='90802'>&lt;/que>&lt;que text='台湾事务' code='90803'>&lt;/que>&lt;/que>&lt;que text='临时工作' code='909'>&lt;que text='民调' code='90901'>&lt;/que>&lt;que text='征求意见' code='90902'>&lt;/que>&lt;que text='建言献策' code='90903'>&lt;/que>&lt;/que>&lt;/que>&lt;que text='超出受理范围' code='10'>&lt;/que>&lt;que text='疫情防控' code='11'>&lt;que text='疫情线索' code='1101'>&lt;que text='鄂籍车辆' code='110101'>&lt;/que>&lt;que text='武汉人员' code='110102'>&lt;/que>&lt;que text='聚众经营' code='110103'>&lt;/que>&lt;que text='野味售卖' code='110104'>&lt;/que>&lt;que text='其他' code='110105'>&lt;/que>&lt;/que>&lt;que text='消费维权' code='1102'>&lt;que text='食宿出行' code='110201'>&lt;/que>&lt;que text='物价上涨' code='110202'>&lt;/que>&lt;que text='物资质量' code='110203'>&lt;/que>&lt;que text='其他' code='110204'>&lt;/que>&lt;/que>&lt;que text='谣言举报' code='1103'>&lt;que text='谣言举报' code='110301'>&lt;/que>&lt;/que>&lt;que text='捐赠截扣' code='1104'>&lt;que text='捐赠截扣' code='110401'>&lt;/que>&lt;/que>&lt;que text='隐私泄露' code='1105'>&lt;que text='隐私泄露' code='110501'>&lt;/que>&lt;/que>&lt;que text='基层防控' code='1106'>&lt;que text='基层防控' code='110601'>&lt;/que>&lt;que text='健康通行卡' code='110602'>&lt;/que>&lt;que text='村居出入' code='110603'>&lt;/que>&lt;que text='物业管控' code='110604'>&lt;/que>&lt;que text='返程返乡' code='110605'>&lt;que text='境内返程' code='11060501'>&lt;/que>&lt;que text='跨境返程' code='11060502'>&lt;que text='隔离政策' code='1106050201'>&lt;/que>&lt;que text='接站政策' code='1106050202'>&lt;/que>&lt;que text='管治政策' code='1106050203'>&lt;/que>&lt;que text='隔离费用问题' code='1106050204'>&lt;/que>&lt;/que>&lt;/que>&lt;/que>&lt;que text='劳资或就学纠纷' code='1107'>&lt;que text='返岗时间' code='110701'>&lt;/que>&lt;que text='假期薪资' code='110702'>&lt;/que>&lt;que text='隔离待遇' code='110703'>&lt;/que>&lt;que text='安全保障' code='110704'>&lt;/que>&lt;que text='其他' code='110705'>&lt;/que>&lt;/que>&lt;que text='疫情进展' code='1108'>&lt;que text='疫情进展' code='110801'>&lt;/que>&lt;/que>&lt;que text='防控政策' code='1109'>&lt;que text='防控政策' code='110901'>&lt;/que>&lt;que text='隔离登记' code='110902'>&lt;/que>&lt;que text='政策咨询' code='110903'>&lt;/que>&lt;que text='其他' code='110904'>&lt;/que>&lt;/que>&lt;que text='防治措施' code='1110'>&lt;que text='防治措施' code='111001'>&lt;/que>&lt;que text='预防手段' code='111002'>&lt;/que>&lt;que text='措施建议' code='111003'>&lt;/que>&lt;que text='其他' code='111004'>&lt;/que>&lt;/que>&lt;que text='捐赠事宜' code='1111'>&lt;que text='捐赠方' code='111101'>&lt;/que>&lt;que text='捐赠中介' code='111102'>&lt;/que>&lt;que text='受捐方' code='111103'>&lt;/que>&lt;/que>&lt;que text='交通出行' code='1112'>&lt;que text='交通管制政策' code='111201'>&lt;/que>&lt;que text='公共交通购票' code='111202'>&lt;/que>&lt;que text='其他' code='111203'>&lt;/que>&lt;/que>&lt;que text='复工达产和复学' code='1113'>&lt;que text='复工复学时间' code='111301'>&lt;/que>&lt;que text='假期薪资' code='111302'>&lt;/que>&lt;que text='隔离待遇' code='111303'>&lt;/que>&lt;que text='活动安排' code='111304'>&lt;/que>&lt;que text='其他' code='111305'>&lt;/que>&lt;que text='复工达产' code='111306'>&lt;que text='企业复工' code='11130601'>&lt;/que>&lt;que text='市场运行' code='11130602'>&lt;/que>&lt;que text='就业保障五险一金' code='11130603'>&lt;/que>&lt;que text='物流运输' code='11130604'>&lt;/que>&lt;que text='农业稳产及农副产品' code='11130605'>&lt;/que>&lt;que text='外贸企业涉外法律咨询及援助' code='11130606'>&lt;/que>&lt;/que>&lt;que text='复学' code='111307'>&lt;que text='开学时间' code='11130701'>&lt;/que>&lt;que text='网络授课' code='11130702'>&lt;/que>&lt;que text='其它' code='11130703'>&lt;/que>&lt;/que>&lt;/que>&lt;que text='传言求证' code='1114'>&lt;que text='传言求证' code='111401'>&lt;/que>&lt;/que>&lt;que text='市民建议' code='1115'>&lt;que text='防护建议' code='111501'>&lt;/que>&lt;que text='捐赠建议' code='111502'>&lt;/que>&lt;que text='信息公开' code='111503'>&lt;/que>&lt;que text='诊疗偏方' code='111504'>&lt;/que>&lt;que text='其他' code='111505'>&lt;/que>&lt;/que>&lt;que text='物资短缺' code='1116'>&lt;que text='物资短缺' code='111601'>&lt;/que>&lt;/que>&lt;que text='外来人员安置' code='1117'>&lt;que text='外来人员安置' code='111701'>&lt;/que>&lt;/que>&lt;que text='确诊或疑似病例' code='1118'>&lt;que text='救治求援' code='111801'>&lt;/que>&lt;que text='隔离环境' code='111802'>&lt;/que>&lt;que text='心理疏导' code='111803'>&lt;/que>&lt;que text='其他' code='111804'>&lt;/que>&lt;/que>&lt;que text='一线医生' code='1119'>&lt;que text='食宿困难' code='111901'>&lt;/que>&lt;que text='心理疏导' code='111902'>&lt;/que>&lt;que text='救治物资' code='111903'>&lt;/que>&lt;que text='隔离环境' code='111904'>&lt;/que>&lt;que text='其他' code='111905'>&lt;/que>&lt;/que>&lt;que text='宠物就医' code='1120'>&lt;que text='宠物就医' code='112001'>&lt;/que>&lt;/que>&lt;que text='返程返乡' code='1121'>&lt;que text='境内返程' code='112101'>&lt;/que>&lt;que text='跨境返程' code='112102'>&lt;/que>&lt;/que>&lt;que text='其他' code='1122'>&lt;que text='其他' code='112201'>&lt;/que>&lt;/que>&lt;/que>&lt;/root>\" />\n" +
            "\t\t\t\t<input name=\"gouxuandaochuXml\" type=\"hidden\" id=\"gouxuandaochuXml\" />\n" +
            "\t\t\t\t<input name=\"oneBLDxml\" type=\"hidden\" id=\"oneBLDxml\" />\n" +
            "\t\t\t\t<input name=\"MessageTypeFlag\" type=\"hidden\" id=\"MessageTypeFlag\" value=\"0\" />\n" +
            "\t\t\t\t<input name=\"sqlwhereHidden\" type=\"hidden\" id=\"sqlwhereHidden\" value=\" and  issend=0 and messageType=0 and (gdzt!=3 or gdzt is null)  and ownerguid='c443f956-8101-48ec-bf0a-80c97039a90e' \" />\n" +
            "\t\t\t\t<input name=\"timeflagTxt\" type=\"hidden\" id=\"timeflagTxt\" />\n" +
            "\t\t\t\t<input name=\"GuidPrint\" type=\"hidden\" id=\"GuidPrint\" />\n" +
            "\t\t\t\t<input name=\"type\" type=\"hidden\" id=\"type\" />\n" +
            "\t\t\t\t<input name=\"IsTwoUnitFlag\" type=\"hidden\" id=\"IsTwoUnitFlag\" />\n" +
            "\n" +
            "\t\t\t\t<div style=\"display:none\">\n" +
            "\t\t\t\t\t<input type=\"submit\" name=\"Button1\" value=\"Button\" id=\"Button1\" />\n" +
            "\n" +
            "        </div>\n" +
            "\n" +
            "\t\t\t\t\t<script language='JavaScript'>\n" +
            "\t\t\t\t\t\tfunction getBodyHeightRemained(){\n" +
            "var alreadyUsedHeight=0;var findForm = document.getElementById('formFind');if (findForm){\n" +
            "var findTable = findForm.parentElement;if (findTable){\n" +
            "alreadyUsedHeight += findTable.offsetHeight;}}\n" +
            "var menuTable = document.getElementById('HMTB');if (menuTable){\n" +
            "alreadyUsedHeight += menuTable.offsetHeight;}\n" +
            "var footerTable = document.getElementById('lkocok_grid_footer');if (footerTable){\n" +
            "alreadyUsedHeight += footerTable.offsetHeight;}\n" +
            "return (document.body.offsetHeight-alreadyUsedHeight);}var tableHeight = getBodyHeightRemained();\n" +
            "var lkocokJhoaGridObj = document.getElementById('JhoaGrid1');if (lkocokJhoaGridObj){\n" +
            "var gridContainer = lkocokJhoaGridObj.parentElement;\n" +
            "if (gridContainer){\n" +
            "if (gridContainer.offsetHeight<gridContainer.scrollHeight)\n" +
            "gridContainer.style.height=tableHeight-3;}}\n" +
            "document.body.style.overflow='hidden';\n" +
            "document.body.scroll='no';\n" +
            "function resizeGrid(){\n" +
            "var tableHeight = getBodyHeightRemained();\n" +
            "var lkocokJhoaGridObj = document.getElementById('JhoaGrid1');if (lkocokJhoaGridObj){\n" +
            "var gridContainer = lkocokJhoaGridObj.parentElement;\n" +
            "if (gridContainer){\n" +
            "if (gridContainer.offsetHeight<gridContainer.scrollHeight)\n" +
            "gridContainer.style.height=tableHeight-3;}}}\n" +
            "document.body.onresize=resizeGrid;resizeGrid();\n" +
            "\t\t\t\t\t</script>\n" +
            "\t</form>\n" +
            "</body>\n" +
            "\n" +
            "</HTML>";
    public static String detailstr = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\n" +
            "<html>\n" +
            "\n" +
            "<head>\n" +
            "\t<title>办理单</title>\n" +
            "\t<meta name=\"GENERATOR\" content=\"Microsoft Visual Studio .NET 7.1\">\n" +
            "\t<meta name=\"CODE_LANGUAGE\" content=\"C#\">\n" +
            "\t<meta name=\"vs_defaultClientScript\" content=\"JavaScript\">\n" +
            "\t<meta name=\"vs_targetSchema\" content=\"http://schemas.microsoft.com/intellisense/ie5\">\n" +
            "\t<link href=\"../yaweiscripts/pagemanage.css\" type=\"text/css\" rel=\"stylesheet\">\n" +
            "\t<script language=\"javascript\" src=\"../yaweiscripts/basic.js\"></script>\n" +
            "\t<script language=\"javascript\" src=\"Scripts/taskHotLine.js\"></script>\n" +
            "\t<script language=\"javascript\" src=\"../yaweiScripts/xmlHttp.js\"></script>\n" +
            "\t<script language=\"javascript\" src=\"Scripts/printName.js\"></script>\n" +
            "\t<script language=\"javascript\" src=\"../yaweiscripts/fileOperate.js\"></script>\n" +
            "\t<script type=\"text/javascript\" language=\"javascript\">\n" +
            "\t\tfunction connectCLS() {\n" +
            "            var gdId = document.getElementById(\"HotLineWorkNumber\").innerHTML;\n" +
            "            var sFeature = \"dialogWidth:560px; dialogHeight:130px;center:yes;help:no;resizable:yes;scroll:yes;status:no\";\n" +
            "            var sPath = \"http://15.1.125.175/rec/getRecordsList.aspx?id=\" + gdId;\n" +
            "\n" +
            "            var arg = new Object();\n" +
            "            showModalDialog(sPath, arg, sFeature)\n" +
            "        }\n" +
            "        function connectCLSHF() {\n" +
            "            var gdId = document.getElementById(\"HotLineWorkNumber\").innerHTML;\n" +
            "            var sFeature = \"dialogWidth:560px; dialogHeight:130px;center:yes;help:no;resizable:yes;scroll:yes;status:no\";\n" +
            "            var sPath = \"http://15.1.125.175/rec/GetReturnVisitRecordsList.aspx?id=\" + gdId;\n" +
            "\n" +
            "            var arg = new Object();\n" +
            "            showModalDialog(sPath, arg, sFeature)\n" +
            "        }\n" +
            "\t</script>\n" +
            "</head>\n" +
            "\n" +
            "<body leftmargin=\"0\" topmargin=\"0\" rightmargin=\"0\" bottommargin=\"0\" ms_positioning=\"GridLayout\">\n" +
            "\t<form name=\"userForm\" method=\"post\"\n" +
            "\t\taction=\"ViewTaskHotLine.aspx?GUID=%7b529e4a19-9fd3-43b3-be16-c3a774f869bf%7d&amp;IsZDDB=&amp;\" id=\"userForm\"\n" +
            "\t\tstyle=\"font-size: 12px\" enctype=\"multipart/form-data\" autocomplete=\"off\">\n" +
            "\t\t<input type=\"hidden\" name=\"__VIEWSTATE\" id=\"__VIEWSTATE\" value=\"/wEPDwULLTE4MzI1NDIyMjQPZBYCAgEPZBYyAgEPDxYCHgRUZXh0BRrmtY7ljZcxMjM0NeWKnueQhumAmuefpeWNlWRkAgMPFgIeCWlubmVyaHRtbAUJ5b6F5aSE55CGZAIEDxYCHwEFEjIwMDUwODEyMzMwMTM0NDAwM2QCBQ8WAh4Fc3R5bGUFDWRpc3BsYXk6bm9uZTtkAgYPFgIfAQUP5LuY5bu65Lic5YWI55SfZAIHDxYCHwEFCzEzNDU1NzkyMzQwZAIIDxYCHwFlZAIJDxYCHwFlZAILDxYCHwEFBueOi+Wpp2QCDA8WAh8BBQQ0NDc1ZAINDxYCHwEFBuadpeeUtWQCDg8WAh8BBQbovazlip5kAg8PFgIfAQUG5rGC5YqpZAIQDxYCHwEFETIwMjAvNS84IDEyOjQxOjUyZAISDxYCHwEFNuS6uuWKm+i1hOa6kOS/nemanO+8jeS8geS4muW3pei1hOemj+WIqe+8jeaLluasoOW3pei1hGQCEw8WAh8BBQnkuI3kv53lr4ZkAhQPFgIfAQUG5Zue5aSNZAIVDxYCHwFlZAIWDxYCHwEFtgPku5jlu7rkuJzlhYjnlJ/mnaXnlLXlj43mmKDvvJrkuYvliY3mp5DojavljLrmtY7ljZflkozlhbTmsb3ovabmnI3liqHmnInpmZDlhazlj7jvvIjlhazlj7jlnLDlnYDvvJrmtY7ljZfluILmp5DojavljLrliJjplb/lsbHot6/nu7/lnLDlm73pmYXoirHpg73vvInku47kuovlj7jmnLrlt6XkvZzvvIzml6DlkIjlkIzvvIzotJ/otKPkurrvvJrliJjmtpvvvIjml6Dms5Xmj5DkvpvogZTns7vmlrnlvI/vvInvvIzovabpmJ/pmJ/plb/vvJrlhq/lrrblu7rvvIzmiYvmnLrlj7fvvJoxMzI1ODA1MzAzMe+8jOiHqjIwMTnlubQ55pyIMjDml6Xoh7Pku4rlt6XotYQxMDAwMOWkmuWFg+acquWPkeaUvu+8jOimgeaxguWwveW/q+WPkeaUvu+8jCDluIzmnJvnm7jlhbPljZXkvY3okL3lrp7lpITnkIbvvIzor7flpITnkIblubblm57lpI3mnaXnlLXkurrjgILmmbrmhafms4nln45kAhcPFgIfAQUb5qeQ6I2r5Yy65pS/5bqc54Ot57q/5Yqe55CGZAIYDxYCHwEFETIwMjAvNS84IDEzOjMwOjAxZAIZDxYCHwEFCjIwMjAtMDUtMTNkAhsPFgIfAWVkAhwPFgIfAWVkAh0PFgIfAWVkZAvieB9+USTV3SUXc9ZyYlibEVa+\" />\n" +
            "\n" +
            "\t\t<script type=\"text/javascript\" src=\"/jhoa_huaiyinqu/ajax/common.ashx\"></script>\n" +
            "\t\t<script type=\"text/javascript\" src=\"/jhoa_huaiyinqu/ajax/Yawei.Jhoa.UI.TaskHotLine.ViewTaskHotLine,JHOA.ashx\">\n" +
            "\t\t</script>\n" +
            "\t\t<input type=\"hidden\" name=\"__VIEWSTATEGENERATOR\" id=\"__VIEWSTATEGENERATOR\" value=\"EF05B836\" />\n" +
            "\t\t<input type=\"hidden\" name=\"__EVENTVALIDATION\" id=\"__EVENTVALIDATION\" value=\"/wEWCgLE3aIWAoznisYGAtmvx7gPAs3qsr8MAtbht/8EAsut888OAqej5LYOAvmEsKsOAqHz3fIGAqbh0IoMkdx9fIxFKFMr1hIh3diNFOAMM7Q=\" />\n" +
            "\t\t<LINK href=\"../yaweiscripts/msnMenu.css\" type=\"text/css\" rel=\"stylesheet\">\n" +
            "\t\t<script language=\"javascript\" src=\"../yaweiscripts/msnMenu.js\"></script>\n" +
            "\t\t<IFRAME class=\"NN\" id=\"Hfrm\" src=\"about:blank\"></IFRAME>\n" +
            "\t\t<TABLE class='N' id='HMTB' cellSpacing='0' cellPadding='0' width='100%' border='0'>\n" +
            "\t\t\t<tr>\n" +
            "\t\t\t\t<td>\n" +
            "\t\t\t\t\t<TABLE class='O' id='menuTable' cellSpacing='0' cellPadding='0' width='100%' border='0'>\n" +
            "\t\t\t\t\t\t<TBODY>\n" +
            "\t\t\t\t\t\t\t<tr>\n" +
            "\t\t\t\t\t\t\t\t<TD style=\"WIDTH: 8px\"><IMG height=\"1\" src=\"../images/spacer.gif\" width=\"8\"></TD>\n" +
            "\t\t\t\t\t\t\t\t<td class='P' onmouseover=\"MO()\" onclick=\"history.back()\" onmouseout=\"MU()\" noWrap>\n" +
            "\t\t\t\t\t\t\t\t\t<IMG alt=\"返回到前一个页面\" hspace=\"1\" src=\"../images/functionkey/back.gif\" align=\"absMiddle\" border=\"0\">返回</TD>\n" +
            "\t\t\t\t\t\t\t\t<TD class=\"LL\">|</TD>\n" +
            "\t\t\t\t\t\t\t\t<td class='P' onmouseover=\"MO()\"\n" +
            "\t\t\t\t\t\t\t\t\tonclick=\"printHotlinework('{529e4a19-9fd3-43b3-be16-c3a774f869bf}')\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"MU()\" noWrap>\n" +
            "\t\t\t\t\t\t\t\t\t<IMG alt=\"打印\" hspace=\"1\" src=\"../images/functionkey/print.gif\" align=\"absMiddle\" border=\"0\">打印1</TD>\n" +
            "\t\t\t\t\t\t\t\t<TD class=\"LL\">|</TD>\n" +
            "\t\t\t\t\t\t\t\t<td class='P' onmouseover=\"MO()\"\n" +
            "\t\t\t\t\t\t\t\t\tonclick=\"printHotlineworkNew('{529e4a19-9fd3-43b3-be16-c3a774f869bf}')\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"MU()\" noWrap>\n" +
            "\t\t\t\t\t\t\t\t\t<IMG alt=\"打印\" hspace=\"1\" src=\"../images/functionkey/print.gif\" align=\"absMiddle\" border=\"0\">打印2</TD>\n" +
            "\t\t\t\t\t\t\t\t<TD class=\"LL\">|</TD>\n" +
            "\t\t\t\t\t\t\t\t<td class='P' onmouseover=\"MO()\"\n" +
            "\t\t\t\t\t\t\t\t\tonclick=\"sendup('{529e4a19-9fd3-43b3-be16-c3a774f869bf}')\" onmouseout=\"MU()\" noWrap>\n" +
            "\t\t\t\t\t\t\t\t\t<IMG alt=\"回复\" hspace=\"1\" src=\"../images/functionkey/send.gif\" align=\"absMiddle\" border=\"0\">回复</TD>\n" +
            "\t\t\t\t\t\t\t\t<TD class=\"LL\">|</TD>\n" +
            "\t\t\t\t\t\t\t\t<td class='P' onmouseover=\"MO()\"\n" +
            "\t\t\t\t\t\t\t\t\tonclick=\"sendChange('{529e4a19-9fd3-43b3-be16-c3a774f869bf}')\" onmouseout=\"MU()\"\n" +
            "\t\t\t\t\t\t\t\t\tnoWrap>\n" +
            "\t\t\t\t\t\t\t\t\t<IMG alt=\"部门回退\" hspace=\"1\" src=\"../images/functionkey/tu_refresh.gif\" align=\"absMiddle\" border=\"0\">部门回退</TD>\n" +
            "\t\t\t\t\t\t\t\t<TD class=\"LL\">|</TD>\n" +
            "\t\t\t\t\t\t\t\t<td class='P' onmouseover=\"MO()\"\n" +
            "\t\t\t\t\t\t\t\t\tonclick=\"sendReplyDelay('{529e4a19-9fd3-43b3-be16-c3a774f869bf}')\" onmouseout=\"MU()\"\n" +
            "\t\t\t\t\t\t\t\t\tnoWrap>\n" +
            "\t\t\t\t\t\t\t\t\t<IMG alt=\"申请延期\" hspace=\"1\" src=\"../images/menu/clock.gif\" align=\"absMiddle\" border=\"0\">申请延期</TD>\n" +
            "\t\t\t\t\t\t\t\t<TD class=\"LL\">|</TD>\n" +
            "\t\t\t\t\t\t\t\t<td class='P' onmouseover=\"MO()\"\n" +
            "\t\t\t\t\t\t\t\t\tonclick=\"writeToHotLine('{529e4a19-9fd3-43b3-be16-c3a774f869bf}','c443f956-8101-48ec-bf0a-80c97039a90e',0)\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"MU()\" noWrap>\n" +
            "\t\t\t\t\t\t\t\t\t<IMG alt=\"下发转办\" hspace=\"1\" src=\"../images/functionkey/bf.gif\" align=\"absMiddle\" border=\"0\">下发转办</TD>\n" +
            "\t\t\t\t\t\t\t\t<TD class=\"LL\">|</TD>\n" +
            "\t\t\t\t\t\t\t\t<td class='P' onmouseover=\"MO()\" onclick=\"serachTaskHotLine('200508123301344003','0')\"\n" +
            "\t\t\t\t\t\t\t\t\tonmouseout=\"MU()\" noWrap>\n" +
            "\t\t\t\t\t\t\t\t\t<IMG alt=\"查相同办理单\" hspace=\"1\" src=\"../images/functionkey/8.gif\" align=\"absMiddle\" border=\"0\">查相同办理单</TD>\n" +
            "\t\t\t\t\t\t\t\t<TD class=\"LL\">|</TD>\n" +
            "\t\t\t\t\t\t\t\t<TD width=\"100%\" align=\"right\"></TD>\n" +
            "\t\t\t\t\t\t\t</TR>\n" +
            "\t\t\t\t\t\t</tbody>\n" +
            "\t\t\t\t\t</TABLE>\n" +
            "\t\t\t\t</TD>\n" +
            "\t\t\t\t<TD style='CURSOR: auto'>\n" +
            "\t\t\t\t\t<TABLE class='O' id='endTable' cellSpacing='0' cellPadding='0' width='100%' border='0'>\n" +
            "\t\t\t\t\t\t<TR>\n" +
            "\t\t\t\t\t\t\t<TD width='100%'>&nbsp;</TD>\n" +
            "\t\t\t\t\t\t</TR>\n" +
            "\t\t\t\t\t</TABLE>\n" +
            "\t\t\t\t</TD>\n" +
            "\t\t\t</TR>\n" +
            "\t\t</TABLE>\n" +
            "\n" +
            "\t\t<table cellspacing=\"0\" cellpadding=\"1\" width=\"100%\" border=\"0\" height=\"50\">\n" +
            "\t\t\t<tr>\n" +
            "\t\t\t\t<td width=\"100%\" align=\"center\" valign=\"middle\">\n" +
            "\t\t\t\t\t<br>\n" +
            "\t\t\t\t\t<font color=\"red\" size=\"5\">\n" +
            "\t\t\t\t\t\t<span id=\"headerTitle\">济南12345办理通知单</span></font>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t</tr>\n" +
            "\t\t\t<tr>\n" +
            "\n" +
            "\n" +
            "\t\t\t</tr>\n" +
            "\t\t\t<tr style=\"display: none\">\n" +
            "\t\t\t\t<td>\n" +
            "\t\t\t\t\t<input type=\"submit\" name=\"Button1\" value=\"Button\" id=\"Button1\" />\n" +
            "                </td>\n" +
            "\t\t\t</tr>\n" +
            "\t\t</table>\n" +
            "\t\t<table class=\"tablebgcolor\" cellspacing=\"1\" cellpadding=\"1\" width=\"100%\" align=\"center\" bgcolor=\"#000000\"\n" +
            "\t\t\tborder=\"0\">\n" +
            "\t\t\t<tr>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"right\" width=\"10%\">\n" +
            "\t\t\t\t\t<font color=\"#000090\">工单状态：</font>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"left\" width=\"20%\" colspan=\"5\">\n" +
            "\t\t\t\t\t<span id=\"gdzt\" class=\"str\">待处理</span>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t</tr>\n" +
            "\t\t\t<tr>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"right\" width=\"10%\">\n" +
            "\t\t\t\t\t<font color=\"#000090\">工单编号：</font>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"left\" width=\"20%\">\n" +
            "\t\t\t\t\t<span id=\"HotLineWorkNumber\" class=\"str\" style=\"width: 99%\" tabindex=\"50\" maxlength=\"30\">200508123301344003</span>\n" +
            "\t\t\t\t\t<input name=\"playRecord\" type=\"button\" id=\"playRecord\" style=\"display:none;\" class=\"buttonSelected\" value=\"播放录音\" onclick=\"connectCLS()\" />\n" +
            "            </td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"right\" width=\"10%\">\n" +
            "\t\t\t\t\t<font color=\"#000090\">联&nbsp;系&nbsp;人：</font>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"left\" width=\"20%\">\n" +
            "\t\t\t\t\t<span id=\"linkPerson\" class=\"str\" tabindex=\"5\" name=\"linkPerson\">付建东先生</span>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"right\" width=\"15%\">\n" +
            "\t\t\t\t\t<font color=\"#000090\">联系电话：</font>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"left\" width=\"25%\">\n" +
            "\t\t\t\t\t<span id=\"linkPhone\" class=\"str\">13455792340</span>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t</tr>\n" +
            "\t\t\t<tr>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"right\" width=\"15%\">\n" +
            "\t\t\t\t\t<font color=\"#000090\">联系地址：</font>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"left\" width=\"35%\" colspan=\"5\">\n" +
            "\t\t\t\t\t<span id=\"address\" class=\"str\" tabindex=\"5\" name=\"address\"></span>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t</tr>\n" +
            "\t\t\t<tr width=\"100%\">\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"right\" width=\"10%\">\n" +
            "\t\t\t\t\t<font color=\"#000090\">营商环境：</font>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"left\" width=\"20%\">\n" +
            "\t\t\t\t\t<span id=\"yshj\" class=\"str\" tabindex=\"5\" name=\"yshj\"></span>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"right\" width=\"10%\">\n" +
            "\t\t\t\t\t<font color=\"#000090\">新版督察：</font>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"left\" width=\"20%\">\n" +
            "\t\t\t\t\t<span id=\"isNewDuCha\" class=\"str\" tabindex=\"5\" name=\"isNewDuCha\"></span>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" colspan=\"2\">\n" +
            "\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t</tr>\n" +
            "\t\t\t<tr width=\"100%\">\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"right\" width=\"10%\">\n" +
            "\t\t\t\t\t<font color=\"#000090\">受理人员：</font>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"left\" width=\"20%\">\n" +
            "\t\t\t\t\t<span id=\"acceptPerson\" class=\"str\" style=\"width: 99%\" tabindex=\"80\" maxlength=\"30\" name=\"acceptPerson\">王婧</span>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"right\" width=\"10%\">\n" +
            "\t\t\t\t\t<font color=\"#000090\">受理员编号：</font>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"left\" width=\"20%\">\n" +
            "\t\t\t\t\t<span id=\"hwyId\" class=\"str\" style=\"width: 100%\" tabindex=\"80\" maxlength=\"30\" name=\"hwyId\">4475</span>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"right\" width=\"10%\">\n" +
            "\t\t\t\t\t<font color=\"#000090\">受理渠道：</font>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"left\" width=\"30%\">\n" +
            "\t\t\t\t\t<span id=\"xxlyId\" tabindex=\"130\" maxlength=\"10\" name=\"xxlyId\">来电</span>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t</tr>\n" +
            "\t\t\t<tr>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"right\" width=\"10%\">\n" +
            "\t\t\t\t\t<font color=\"#000090\">办理类型：</font>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"left\" width=\"20%\">\n" +
            "\t\t\t\t\t<span id=\"sllx\" tabindex=\"130\" maxlength=\"10\" name=\"sllx\">转办</span>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"right\" width=\"10%\">\n" +
            "\t\t\t\t\t<font color=\"#000090\">来电类别：</font>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"left\" width=\"20%\">\n" +
            "\t\t\t\t\t<span id=\"ldlbid\" tabindex=\"130\" maxlength=\"10\" name=\"ldlbid\">求助</span>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"right\" width=\"10%\">\n" +
            "\t\t\t\t\t<font color=\"#000090\">录入时间：</font>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"left\" width=\"30%\">\n" +
            "\t\t\t\t\t<span id=\"writeTime\" class=\"str\" style=\"width: 99%\" tabindex=\"120\" maxlength=\"10\" name=\"writeTime\">2020/5/8 12:41:52</span>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t</tr>\n" +
            "\t\t\t<tr width=\"100%\">\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"right\" width=\"10%\">\n" +
            "\t\t\t\t\t<font color=\"#000090\">紧急程度：</font>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"left\" width=\"20%\">\n" +
            "\t\t\t\t\t<select name=\"urgencyDegree\" id=\"urgencyDegree\" unselectable=\"off\">\n" +
            "\t<option selected=\"selected\" value=\"1\">一般</option>\n" +
            "\t<option value=\"2\">复杂</option>\n" +
            "\t<option value=\"3\">紧急</option>\n" +
            "\t<option value=\"4\">特急</option>\n" +
            "</select>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"right\" width=\"10%\">\n" +
            "\t\t\t\t\t<font color=\"#000090\">问题分类：</font>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"left\" width=\"60%\" colspan=\"3\">\n" +
            "\t\t\t\t\t<span id=\"quesTypeInfo\" tabindex=\"90\">人力资源保障－企业工资福利－拖欠工资</span>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t</tr>\n" +
            "\t\t\t<tr>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"right\" width=\"10%\">\n" +
            "\t\t\t\t\t<font color=\"#000090\">是否保密：</font>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"left\" width=\"20%\">\n" +
            "\t\t\t\t\t<span id=\"isSecret\" tabindex=\"130\" maxlength=\"10\" name=\"isSecret\">不保密</span>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"right\" width=\"10%\">\n" +
            "\t\t\t\t\t<font color=\"#000090\">是否回复：</font>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"left\" width=\"20%\">\n" +
            "\t\t\t\t\t<span id=\"isReply\" tabindex=\"130\" maxlength=\"10\" name=\"isReply\">回复</span>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"right\" width=\"10%\">\n" +
            "\t\t\t\t\t<font color=\"#000090\">回复备注：</font>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"left\" width=\"30%\">\n" +
            "\t\t\t\t\t<span id=\"hfdh\" tabindex=\"130\" maxlength=\"10\" name=\"hfdh\"></span>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t</tr>\n" +
            "\t\t\t<tr>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"right\" width=\"10%\">\n" +
            "\t\t\t\t\t<font color=\"#000090\">问题描述：</font>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" width=\"90%\" colspan=\"5\">\n" +
            "\t\t\t\t\t<textarea name=\"content\" id=\"content\" style=\"width: 99%;\" rows=\"4\" readonly=\"\">付建东先生来电反映：之前槐荫区济南和兴汽车服务有限公司（公司地址：济南市槐荫区刘长山路绿地国际花都）从事司机工作，无合同，负责人：刘涛（无法提供联系方式），车队队长：冯家建，手机号：13258053031，自2019年9月20日至今工资10000多元未发放，要求尽快发放， 希望相关单位落实处理，请处理并回复来电人。智慧泉城</textarea>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t</tr>\n" +
            "\t\t\t<tr>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"right\" width=\"10%\">\n" +
            "\t\t\t\t\t<font color=\"#000090\">附&nbsp;&nbsp;&nbsp;&nbsp;件：</font>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" width=\"90%\" colspan=\"5\">\n" +
            "\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t</tr>\n" +
            "\t\t\t<tr>\n" +
            "\t\t\t\t<td align=\"center\" class=\"tdbgcolor\" colspan=\"6\">\n" +
            "\t\t\t\t\t办理信息\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t</tr>\n" +
            "\t\t\t<tr>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"right\" width=\"10%\">\n" +
            "\t\t\t\t\t<font color=\"#000090\">发送人：</font>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"left\" width=\"20%\">\n" +
            "\t\t\t\t\t<span id=\"sendPerson\" class=\"str\" tabindex=\"5\" name=\"sendPerson\">槐荫区政府热线办理</span>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"right\" width=\"10%\">\n" +
            "\t\t\t\t\t<font color=\"#000090\">发送时间：</font>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"left\" width=\"20%\">\n" +
            "\t\t\t\t\t<span id=\"sendTime\" class=\"str\" tabindex=\"5\" name=\"sendTime\">2020/5/8 13:30:01</span>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"right\" width=\"10%\">\n" +
            "\t\t\t\t\t<font color=\"#000090\">办理时限：</font>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"left\" width=\"20%\">\n" +
            "\t\t\t\t\t<span id=\"endDate\" class=\"str\" tabindex=\"140\" type=\"text\" style=\"width: 99%\" name=\"endDate\">2020-05-13</span>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t</tr>\n" +
            "\t\t\t<tr id=\"txlxTr\" style=\"display: none\">\n" +
            "\t\t\t\t<td id=\"txlxLab\" class=\"tdbgcolor\" align=\"right\" width=\"10%\">\n" +
            "\t\t\t\t\t<font color=\"#000090\">督办类型：</font>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td id=\"txlxSelect\" class=\"tdbgcolor\" align=\"left\" width=\"20%\">\n" +
            "\n" +
            "\t\t\t\t\t<span id=\"txlx\" class=\"str\" tabindex=\"141\" type=\"text\" style=\"width: 99%\">\n" +
            "                </span>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td id=\"Td1\" class=\"tdbgcolor\" align=\"right\" width=\"10%\">\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td id=\"Td2\" class=\"tdbgcolor\" align=\"left\" width=\"20%\">\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td id=\"Td3\" class=\"tdbgcolor\" align=\"right\" width=\"10%\">\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td id=\"Td4\" class=\"tdbgcolor\" align=\"left\" width=\"20%\">\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t</tr>\n" +
            "\n" +
            "\t\t\t<tr>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"right\" width=\"15%\">\n" +
            "\t\t\t\t\t<font color=\"#000090\">转办意见：</font>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"right\" colspan=\"5\" width=\"85%\">\n" +
            "\t\t\t\t\t<textarea name=\"remark\" id=\"remark\" rows=\"4\" style=\"width: 100%\" readonly=\"\"></textarea>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t</tr>\n" +
            "\t\t\t<tr>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"right\" width=\"15%\">\n" +
            "\t\t\t\t\t<font color=\"#000090\">转办流程：</font>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"right\" colspan=\"5\" width=\"85%\">\n" +
            "\t\t\t\t\t<textarea name=\"banliFlow\" id=\"banliFlow\" rows=\"4\" style=\"width: 100%\" readonly=\"\"></textarea>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t</tr>\n" +
            "\t\t\t<tr>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"right\" width=\"15%\">\n" +
            "\t\t\t\t\t<font color=\"#000090\">备&nbsp;&nbsp;&nbsp;&nbsp;注：</font>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t\t<td class=\"tdbgcolor\" align=\"right\" colspan=\"5\" width=\"85%\">\n" +
            "\t\t\t\t\t<textarea name=\"beizhu\" id=\"beizhu\" rows=\"4\" style=\"width: 100%\" readonly=\"\"></textarea>\n" +
            "\t\t\t\t</td>\n" +
            "\t\t\t</tr>\n" +
            "\n" +
            "\t\t</table>\n" +
            "\t\t<input name=\"GuidPrint\" type=\"hidden\" id=\"GuidPrint\" />\n" +
            "\t\t<input name=\"type\" type=\"hidden\" id=\"type\" />\n" +
            "\n" +
            "    </form>\n" +
            "\t\t<object id=\"WordContainer\" style=\"display: none\" codebase=\"../yaweiscripts/OfficeAgent.CAB#version=2,0,0,1\"\n" +
            "        classid=\"CLSID:5EE00CCC-4762-47C1-ADDB-FE530AF99C25\" viewastext>\n" +
            "</body>\n" +
            "</html>";
}
