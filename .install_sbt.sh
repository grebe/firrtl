set -ex
if [ ! -f $INSTALL_DIR/bin/sbt ]; then
  mkdir -p $INSTALL_DIR
  pushd $INSTALL_DIR
  curl -sS https://github.com/sbt/sbt/releases/download/v1.2.7/sbt-1.2.7.zip
  unzip sbt-1.2.7.zip
  rm sbt-1.2.7.zip
  popd
fi
