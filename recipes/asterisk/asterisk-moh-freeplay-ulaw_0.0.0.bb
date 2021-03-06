DESCRIPTION="The Asterisk open source software PBX"
HOMEPAGE="http://www.asterisk.org"
SECTION = "voip"
LICENSE="GPL"
#DEPENDS="asterisk"
PR = "r1"

SRC_URI="http://downloads.asterisk.org/pub/telephony/sounds/releases/asterisk-moh-freeplay-ulaw.tar.gz"

do_install() {
	install -d ${D}${localstatedir}/lib/asterisk/moh
	#install -m 644 ${WORKDIR}/*.ulaw ${D}${localstatedir}/lib/asterisk/moh/
	#install -m 644 ${WORKDIR}/LICENSE-* ${D}${localstatedir}/lib/asterisk/moh/
	mv ${WORKDIR}/*.ulaw ${D}${localstatedir}/lib/asterisk/moh/
	mv ${WORKDIR}/LICENSE-* ${D}${localstatedir}/lib/asterisk/moh/
}

pkg_postinst_prepend() {
	chown -R asterisk:asterisk ${localstatedir}/lib/asterisk/moh/
}

SRC_URI[md5sum] = "d5107998109f3bda5f528e548dd838dc"
SRC_URI[sha256sum] = "95b163d7f931d58864aba2cfe32156accca7af782c850fb867a85ce88c02573c"

