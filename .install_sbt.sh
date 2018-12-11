set -e
if [ ! -f $INSTALL_DIR/bin/sbt ]; then
  mkdir -p $INSTALL_DIR
  pushd $INSTALL_DIR
  curl -sS https://piccolo.link/sbt-1.2.7.zip
  unzip sbt-1.2.7.zip
  rm sbt-1.2.7.zip
  popd
fi
