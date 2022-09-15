# This file is generated by gyp; do not edit.

include $(CLEAR_VARS)

LOCAL_MODULE_CLASS := SHARED_LIBRARIES
LOCAL_MODULE := lib_clients_android_jni_viewfinder_gyp
LOCAL_MODULE_SUFFIX := .so
LOCAL_MODULE_TAGS := optional
gyp_intermediate_dir := $(abspath $(LOCAL_PATH)/clients/android/jni)

# Make sure our deps are built first.
GYP_TARGET_DEPENDENCIES := \
	$(call intermediates-dir-for,STATIC_LIBRARIES,third_party_shared_libleveldb_gyp)/third_party_shared_libleveldb_gyp.a \
	$(call intermediates-dir-for,STATIC_LIBRARIES,third_party_shared_libprotobuf_gyp)/third_party_shared_libprotobuf_gyp.a \
	$(call intermediates-dir-for,STATIC_LIBRARIES,third_party_shared_libsnappy_gyp)/third_party_shared_libsnappy_gyp.a \
	$(call intermediates-dir-for,STATIC_LIBRARIES,third_party_shared_libre2_gyp)/third_party_shared_libre2_gyp.a \
	$(call intermediates-dir-for,STATIC_LIBRARIES,third_party_shared_icui18n_gyp)/third_party_shared_icui18n_gyp.a \
	$(call intermediates-dir-for,STATIC_LIBRARIES,third_party_shared_icuuc_gyp)/third_party_shared_icuuc_gyp.a \
	$(call intermediates-dir-for,STATIC_LIBRARIES,third_party_shared_icudata_gyp)/third_party_shared_icudata_gyp.a \
	$(call intermediates-dir-for,STATIC_LIBRARIES,third_party_shared_libphonenumbers_gyp)/third_party_shared_libphonenumbers_gyp.a \
	$(call intermediates-dir-for,STATIC_LIBRARIES,clients_shared_libshared_gyp)/clients_shared_libshared_gyp.a \
	$(call intermediates-dir-for,STATIC_LIBRARIES,clients_shared_sharedprotos_gyp)/clients_shared_sharedprotos_gyp.a \
	$(call intermediates-dir-for,STATIC_LIBRARIES,third_party_shared_libprotobuf_lite_gyp)/third_party_shared_libprotobuf_lite_gyp.a \
	$(call intermediates-dir-for,STATIC_LIBRARIES,third_party_shared_phonenumbersprotos_gyp)/third_party_shared_phonenumbersprotos_gyp.a \
	$(call intermediates-dir-for,STATIC_LIBRARIES,third_party_shared_libjsoncpp_gyp)/third_party_shared_libjsoncpp_gyp.a

GYP_GENERATED_OUTPUTS :=

# Make sure our deps and generated files are built first.
GYP_TARGET_DEPENDENCIES += $(GYP_GENERATED_OUTPUTS)

LOCAL_CPP_EXTENSION := .cc
LOCAL_GENERATED_SOURCES :=

GYP_COPIED_SOURCE_ORIGIN_DIRS :=

LOCAL_SRC_FILES := \
	clients/android/jni/DayTableEnv.cc \
	clients/android/jni/DBMigrationAndroid.cc \
	clients/android/jni/NativeAppState.cc \
	clients/android/jni/NetworkManagerAndroid.cc


# Flags passed to both C and C++ files.
MY_CFLAGS_Default :=

MY_DEFS_Default := \
	'-D__GCC_HAVE_SYNC_COMPARE_AND_SWAP_1' \
	'-D__GCC_HAVE_SYNC_COMPARE_AND_SWAP_2' \
	'-D__GCC_HAVE_SYNC_COMPARE_AND_SWAP_4' \
	'-D__GCC_HAVE_SYNC_COMPARE_AND_SWAP_8' \
	'-DLEVELDB_PLATFORM_ANDROID' \
	'-DLEVELDB_PLATFORM_POSIX' \
	'-DOS_ANDROID'


# Include paths placed before CFLAGS/CPPFLAGS
LOCAL_C_INCLUDES_Default := \
	$(LOCAL_PATH)/third_party/shared/leveldb/include \
	$(LOCAL_PATH)/third_party/shared/leveldb \
	$(LOCAL_PATH)/third_party/shared/protobuf/src \
	$(LOCAL_PATH)/third_party/shared/protobuf \
	$(LOCAL_PATH)/third_party/shared/re2 \
	$(LOCAL_PATH)/third_party/shared/icu \
	$(LOCAL_PATH)/third_party/shared/icu/source/common \
	$(LOCAL_PATH)/third_party/shared/icu/source/i18n \
	$(LOCAL_PATH)/third_party/shared/icu/source/tools/tzcode \
	$(LOCAL_PATH)/third_party/shared/phonenumbers/cpp/src \
	$(LOCAL_PATH)/clients/android/gen \
	$(LOCAL_PATH)/third_party/shared/snappy \
	$(LOCAL_PATH)/third_party/shared/protobuf/src \
	$(LOCAL_PATH)/third_party/shared/re2 \
	$(LOCAL_PATH)/clients/shared/protoc_out \
	$(LOCAL_PATH)/clients/shared \
	$(LOCAL_PATH)/clients/shared/protoc_out \
	$(LOCAL_PATH)/third_party/shared/jsoncpp/include


# Flags passed to only C++ (and not C) files.
LOCAL_CPPFLAGS_Default := \
	-std=c++11 \
	-stdlib=libc++ \
	-frtti \
	-g


LOCAL_CFLAGS := $(MY_CFLAGS_$(GYP_CONFIGURATION)) $(MY_DEFS_$(GYP_CONFIGURATION))
LOCAL_C_INCLUDES := $(GYP_COPIED_SOURCE_ORIGIN_DIRS) $(LOCAL_C_INCLUDES_$(GYP_CONFIGURATION))
LOCAL_CPPFLAGS := $(LOCAL_CPPFLAGS_$(GYP_CONFIGURATION))
### Rules for final target.

LOCAL_LDFLAGS_Default := \
	-lz \
	-llog


LOCAL_LDFLAGS := $(LOCAL_LDFLAGS_$(GYP_CONFIGURATION))

LOCAL_STATIC_LIBRARIES := \
	third_party_shared_libleveldb_gyp \
	third_party_shared_libprotobuf_gyp \
	third_party_shared_libsnappy_gyp \
	third_party_shared_libre2_gyp \
	third_party_shared_icui18n_gyp \
	third_party_shared_icuuc_gyp \
	third_party_shared_icudata_gyp \
	third_party_shared_libphonenumbers_gyp \
	clients_shared_libshared_gyp \
	clients_shared_sharedprotos_gyp \
	third_party_shared_libprotobuf_lite_gyp \
	third_party_shared_phonenumbersprotos_gyp \
	third_party_shared_libjsoncpp_gyp

# Enable grouping to fix circular references
LOCAL_GROUP_STATIC_LIBRARIES := true

LOCAL_SHARED_LIBRARIES :=

# Add target alias to "gyp_all_modules" target.
.PHONY: gyp_all_modules
gyp_all_modules: lib_clients_android_jni_viewfinder_gyp

# Alias gyp target name.
.PHONY: viewfinder
viewfinder: lib_clients_android_jni_viewfinder_gyp

LOCAL_PRELINK_MODULE := false
include $(BUILD_SHARED_LIBRARY)