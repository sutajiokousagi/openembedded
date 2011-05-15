require emacs.inc

EXTRA_OECONF = "--without-sound --without-x"

SRC_URI = "${GNU_MIRROR}/emacs/emacs-${PV}.tar.gz;name=tarball \
	   file://emacs23.2-use-qemu.patch \
	   file://nostdlib-unwind.patch"
SRC_URI[tarball.md5sum] = "b6691852dae0bc142b3c12749f6b7ade"
SRC_URI[tarball.sha256sum] = "1617b8289e403bc6345f8fcc4b3ec01755962cf8842b505d971efe08c9bf7919"


S = "${WORKDIR}/emacs-${PV}"
