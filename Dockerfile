FROM scratch
ADD build/bin/linux/releaseExecutable/web-site-samples-mpp-kn-app-kotlin-windows.kexe static-binary

CMD ["./static-binary"]
